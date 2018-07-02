package com.example.lucas.recycleviewwithitemclick;

import android.view.View;

/**
 * Created by Lucas on 01/07/2018.
 */

public interface ItemClickListener {

    void onClick(View view, int position, boolean isLongClick);

}
