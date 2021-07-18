/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.wordsapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupActionBarWithNavController

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wordsapp.databinding.ActivityMainBinding


/**
 * Main Activity and entry point for the app. Displays a RecyclerView of letters.
 */
class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var isLinearLayout=true
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        setupActionBarWithNavController(navController)



//        recyclerView = binding.recyclerView
//        // Sets the LinearLayoutManager of the recyclerview
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = LetterAdapter()
//        chooseLayout()
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }


//    private fun chooseLayout(){
//        if(isLinearLayout){
//            recyclerView.layoutManager=LinearLayoutManager(this)
//        }
//        else{
//            recyclerView.layoutManager=GridLayoutManager(this,4)
//        }
//        recyclerView.adapter=LetterAdapter()
//    }
//
//    private fun setIcon(menuItem: MenuItem){
//        if(menuItem==null){return}
//
//        menuItem.icon=
//            if(isLinearLayout){ContextCompat.getDrawable(this,R.drawable.ic_grid_layout)}
//            else{ContextCompat.getDrawable(this,R.drawable.ic_linear_list)}
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.layout_menu,menu)
//
//        val layoutButton=menu?.findItem(R.id.action_switch_layout)
//        if (layoutButton != null) {
//            setIcon(layoutButton)
//        }
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when(item.itemId){
//            R.id.action_switch_layout->{
//                isLinearLayout=!isLinearLayout
//                chooseLayout()
//                setIcon(item)
//
//                return true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }

}
