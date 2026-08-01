// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import android.content.ContentValues;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import java.io.File;
import t.ˆʿ.CLS38;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ᵔʾ.CLS304;

public final class CLS98 implements AdapterView.OnItemClickListener {
    public final int FLD741;
    public final Object FLD742;

    public CLS98(Object object0, int v) {
        this.FLD741 = v;
        this.FLD742 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        Object object0 = this.FLD742;
        if(this.FLD741 == 0) {
            CLS290 ˊﾞ0 = (CLS290)((CLS105)object0).FLD785.FLD550.get(v);
            if(!ˊﾞ0.FLD754.equals("menu_header")) {
                String s = ˊﾞ0.FLD754;
                for(int v2 = 0; true; ++v2) {
                    boolean z = false;
                    if(v2 >= 4) {
                        break;
                    }
                    String s1 = new String[]{"tab_main", "tab_contacts", "tab_discover", "tab_me"}[v2];
                    if(!TextUtils.isEmpty(s1) && s.equalsIgnoreCase(s1)) {
                        z = true;
                        break;
                    }
                }
                if(z) {
                    ((CLS105)object0).FLD785.FLD547 = ˊﾞ0.FLD754;
                    ((CLS105)object0).FLD785.notifyDataSetChanged();
                }
                CLS102 יﹳ0 = ((CLS105)object0).FLD783;
                if(יﹳ0.MTH1818("DrawerAutoClose", false)) {
                    Object[] arr_object = {Boolean.valueOf(יﹳ0.MTH1818("DrawerOpenRight", false))};
                    CLS123.FLD912.MTH2004("core", "DrawerLayout_closeDrawer", arr_object);
                }
                CLS304 ﾞᐧ0 = new CLS304(((CLS105)object0), ˊﾞ0, 7);
                CLS137.FLD972.MTH2145(((CLS136)ﾞᐧ0));
            }
            return;
        }
        CLS38 יᐧ0 = (CLS38)object0;
        יᐧ0.getClass();
        try {
            ContentValues contentValues0 = (ContentValues)יᐧ0.FLD480.getItem(v);
            if(contentValues0.getAsString("content").equals("|wx_prev_dir|")) {
                File file0 = יᐧ0.FLD481;
                if(file0 != null) {
                    if(file0.isDirectory()) {
                        יᐧ0.FLD485 = יᐧ0.FLD486;
                        יᐧ0.FLD486 = יᐧ0.FLD481.getParentFile();
                    }
                    else {
                        File file1 = יᐧ0.FLD481.getParentFile();
                        if(file1 != null) {
                            יᐧ0.FLD485 = יᐧ0.FLD486;
                            יᐧ0.FLD486 = file1.getParentFile();
                        }
                    }
                }
                יᐧ0.FLD481 = יᐧ0.FLD486;
            }
            else {
                File file2 = new File(contentValues0.getAsString("path"));
                יᐧ0.FLD481 = file2;
                יᐧ0.FLD485 = יᐧ0.FLD486;
                if(file2.isDirectory()) {
                    יᐧ0.FLD486 = יᐧ0.FLD481;
                }
            }
            יᐧ0.MTH1385();
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }
}

