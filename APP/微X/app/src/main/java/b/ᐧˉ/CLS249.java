// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS91;
import b.ˈˊ.CLS99;
import b.ᵔʾ.CLS304.CLS303;
import b.ⁱʾ.CLS341;
import b.ⁱʾ.CLS363;
import b.ⁱᵔ.CLS425;
import b.ⁱᵔ.CLS442;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS507;
import java.io.File;

public final class CLS249 implements AdapterView.OnItemClickListener {
    public final int FLD2606;
    public final Object FLD2607;

    public CLS249(int v, Object object0) {
        this.FLD2606 = v;
        this.FLD2607 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        File file5;
        File file1;
        Object object0 = this.FLD2607;
        switch(this.FLD2606) {
            case 0: {
                ((CLS174)object0).getClass();
                ((CLS174)object0).MTH3357(CLS27.MTH889("modify"), ((CLS303)((CLS174)object0).FLD1681.getItem(v)), true);
                return;
            }
            case 1: {
                ((CLS244)object0).getClass();
                if(((CLS244)object0).FLD2538.MTH6895("multi_response")) {
                    String s = CLS27.MTH889("modify");
                    ((CLS244)object0).MTH4263(((CLS91)((CLS244)object0).FLD2543.getItem(v)), s);
                    return;
                }
                String s1 = CLS27.MTH889("modify");
                ((CLS244)object0).MTH4270(((CLS91)((CLS244)object0).FLD2543.getItem(v)), s1);
                return;
            }
            case 2: {
                CLS210 ˋʼ0 = (CLS210)object0;
                ˋʼ0.getClass();
                try {
                    if(CLS502.MTH6934(ˋʼ0.FLD1998, new String[]{"_tail"})) {
                        ˋʼ0.MTH3741(v, CLS27.MTH889("modify"));
                        return;
                    }
                    if(!ˋʼ0.FLD1999 && ˋʼ0.FLD2011.MTH6895("multi_response") || ˋʼ0.FLD1998.equals("_MOMENT_POST_MESSAGE_")) {
                        ˋʼ0.MTH3743(v, CLS27.MTH889("modify"));
                        return;
                    }
                    ˋʼ0.MTH3742(v, CLS27.MTH889("modify"));
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 3: {
                CLS99 ﾞᵎ0 = (CLS99)((CLS1078)object0).FLD2317.getItem(v);
                if(ﾞᵎ0 != null) {
                    ((CLS1078)object0).MTH4070(ﾞᵎ0, ((CLS3)new CLS1212(((CLS1078)object0), 3)));
                }
                return;
            }
            case 4: {
                CLS442 ˎᵢ0 = (CLS442)object0;
                ˎᵢ0.getClass();
                try {
                    ContentValues contentValues0 = (ContentValues)ˎᵢ0.FLD4218.getItem(v);
                    if(contentValues0.getAsString("content").equals("|wx_prev_dir|")) {
                        File file0 = ˎᵢ0.FLD4219;
                        if(file0 != null) {
                            if(file0.isDirectory()) {
                                file1 = ˎᵢ0.FLD4219.getParentFile();
                                if(file1 != null) {
                                    ˎᵢ0.FLD4223 = ˎᵢ0.FLD4224;
                                    ˎᵢ0.FLD4224 = file1;
                                }
                            }
                            else {
                                File file2 = ˎᵢ0.FLD4219.getParentFile();
                                if(file2 != null) {
                                    file1 = file2.getParentFile();
                                    if(file1 != null) {
                                        ˎᵢ0.FLD4223 = ˎᵢ0.FLD4224;
                                        ˎᵢ0.FLD4224 = file1;
                                    }
                                }
                            }
                        }
                        ˎᵢ0.FLD4219 = ˎᵢ0.FLD4224;
                    }
                    else {
                        File file3 = new File(contentValues0.getAsString("path"));
                        ˎᵢ0.FLD4219 = file3;
                        ˎᵢ0.FLD4223 = ˎᵢ0.FLD4224;
                        if(file3.isDirectory()) {
                            ˎᵢ0.FLD4224 = ˎᵢ0.FLD4219;
                        }
                    }
                    ˎᵢ0.MTH6229();
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 5: {
                CLS507 ﹳˊ0 = (CLS507)object0;
                ﹳˊ0.getClass();
                try {
                    ContentValues contentValues1 = (ContentValues)ﹳˊ0.FLD4996.getItem(v);
                    if(contentValues1.getAsString("content").equals("|wx_prev_dir|")) {
                        File file4 = ﹳˊ0.FLD5000;
                        if(file4 != null) {
                            if(file4.isDirectory()) {
                                file5 = ﹳˊ0.FLD5000.getParentFile();
                                if(file5 != null) {
                                    ﹳˊ0.FLD5006 = ﹳˊ0.FLD5001;
                                    ﹳˊ0.FLD5001 = file5;
                                }
                            }
                            else {
                                File file6 = ﹳˊ0.FLD5000.getParentFile();
                                if(file6 != null) {
                                    file5 = file6.getParentFile();
                                    if(file5 != null) {
                                        ﹳˊ0.FLD5006 = ﹳˊ0.FLD5001;
                                        ﹳˊ0.FLD5001 = file5;
                                    }
                                }
                            }
                        }
                        ﹳˊ0.FLD5000 = ﹳˊ0.FLD5001;
                    }
                    else {
                        File file7 = new File(contentValues1.getAsString("path"));
                        ﹳˊ0.FLD5000 = file7;
                        ﹳˊ0.FLD5006 = ﹳˊ0.FLD5001;
                        if(file7.isDirectory()) {
                            ﹳˊ0.FLD5001 = ﹳˊ0.FLD5000;
                        }
                    }
                    ﹳˊ0.MTH6978();
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 6: {
                CLS341 ـﹳ0 = ((CLS341[])object0)[0];
                ـﹳ0.MTH5152(v, !ـﹳ0.FLD3366[v]);
                ـﹳ0.notifyDataSetChanged();
                return;
            }
            case 7: {
                ((CLS363)object0).MTH5262(v, !((CLS363)object0).FLD3446[v]);
                ((CLS363)object0).notifyDataSetChanged();
                return;
            }
            default: {
                CLS425 ˊﹳ0 = (CLS425)object0;
                if(!ˊﹳ0.FLD4101 && !ˊﹳ0.FLD4093) {
                    try {
                        ˊﹳ0.MTH6090("");
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }
    }
}

