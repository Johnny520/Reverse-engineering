// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS43;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS581;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS79;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1229;
import b.ᵔʾ.CLS1262;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class CLS323 extends BaseAdapter {
    public static final class CLS321 {
        public TextView FLD3271;
        public ImageView FLD3272;
        public TextView FLD3273;
        public TextView FLD3274;
        public TextView FLD3275;
        public ImageView FLD3276;
        public RelativeLayout FLD3277;
        public TextView FLD3278;

    }

    public interface CLS322 {
    }

    public final CLS79 FLD3279;
    public final CLS43 FLD3280;
    public final String FLD3281;
    public final CLS371 FLD3282;
    public final CLS29 FLD3283;
    public final String FLD3284;
    public CLS322 FLD3285;
    public final HashMap FLD3286;
    public final HashSet FLD3287;
    public final String FLD3288;
    public Drawable FLD3289;
    public final ArrayList FLD3290;
    public final HashMap FLD3291;
    public final HashSet FLD3292;
    public boolean FLD3293;
    public final boolean FLD3294;
    public final HashMap FLD3295;
    public final String FLD3296;
    public final HashMap FLD3297;
    public Drawable FLD3298;
    public final HashMap FLD3299;
    public final WeakReference FLD3300;
    public final HashMap FLD3301;
    public final HashMap FLD3302;

    // 此方法包含解密的字符串
    // This method was un-flattened
    public CLS323(Activity activity0, ArrayList arrayList0, HashSet hashSet0, HashSet hashSet1, String s, CLS581 ˉᐧ0) {
        List list1;
        List list0;
        Iterator iterator1;
        CLS371 ʻ0;
        String s1;
        HashMap hashMap1;
        CLS43 ˆʿ0;
        this.FLD3293 = false;
        this.FLD3290 = new ArrayList();
        this.FLD3300 = new WeakReference(activity0);
        this.FLD3284 = s;
        this.FLD3282 = CLS371.FLD3470;
        this.FLD3295 = new HashMap();
        this.FLD3291 = new HashMap();
        this.FLD3286 = new HashMap();
        this.FLD3302 = new HashMap();
        this.FLD3297 = new HashMap();
        this.FLD3287 = hashSet0;
        this.FLD3292 = hashSet1;
        this.FLD3301 = new HashMap();
        this.FLD3280 = (CLS43)CLS40.FLD157.MTH1118(CLS43.class);
        this.FLD3281 = CLS27.MTH904();
        this.FLD3279 = CLS79.FLD292;
        this.FLD3283 = CLS27.MTH895();
        this.FLD3299 = new HashMap();
        boolean z = CLS21.FLD76.MTH830("isThemeEnable", new Object[]{"MainFragmentBackgroundEnable"});
        this.FLD3294 = z;
        if(z) {
            this.FLD3288 = CLS522.MTH7113(Color.argb(Math.round(((float)Color.alpha(-1)) * 0.5f), Color.red(-1), Color.green(-1), Color.blue(-1)));
            int v = CLS522.MTH7110("#F7F3F7");
            this.FLD3296 = CLS522.MTH7113(Color.argb(Math.round(((float)Color.alpha(v)) * 0.5f), Color.red(v), Color.green(v), Color.blue(v)));
        }
        this.FLD3285 = ˉᐧ0;
        boolean z1 = s.equals("wx__MAIN_");
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        for(Iterator iterator0 = arrayList0.iterator(); true; iterator0 = iterator1) {
            boolean z2 = iterator0.hasNext();
            ˆʿ0 = this.FLD3280;
            HashMap hashMap0 = this.FLD3301;
            hashMap1 = this.FLD3297;
            s1 = this.FLD3281;
            ʻ0 = this.FLD3282;
            if(!z2) {
                break;
            }
            Object object0 = iterator0.next();
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(ˊﾞ0 == null) {
                iterator1 = iterator0;
            }
            else {
                if(!z1 || !CLS404.MTH5909("")) {
                    iterator1 = iterator0;
                }
                else {
                    String s2 = "".substring(3);
                    HashSet hashSet4 = new HashSet();
                    iterator1 = iterator0;
                    switch(s2) {
                        case "_MUTE_": {
                            list0 = ʻ0.MTH5336(s1);
                            break;
                        }
                        case "_OWN_": {
                            list0 = ʻ0.MTH5322(s1);
                            break;
                        }
                        case "_WORK_": {
                            list0 = ʻ0.MTH5351(s1);
                            break;
                        }
                        default: {
                            list0 = Arrays.asList(CLS502.MTH6941(ˆʿ0.MTH1162(s2)));
                        }
                    }
                    hashSet4.addAll(list0);
                    hashMap0.put("", hashSet4);
                    this.FLD3287.add("");
                }
                if(!CLS21.FLD76.MTH830("isHidden", new Object[]{""})) {
                    hashMap1.put("", ˊﾞ0);
                }
            }
        }
        if(z1) {
            String s3 = this.FLD3283.MTH925("wx_chatroom_containers", "");
            if(!TextUtils.isEmpty(s3)) {
                for(Object object1: new ArrayList(Arrays.asList(CLS502.MTH6941(s3)))) {
                    String s4 = (String)object1;
                    if(!s4.equals("wx__MAIN_")) {
                        String s5 = s4.substring(3);
                        HashSet hashSet5 = new HashSet();
                        int v1 = s5.hashCode();
                        if(v1 != -1501471641) {
                            switch(v1) {
                                case 0xA70B866F: {
                                    if(s5.equals("_WORK_")) {
                                        list1 = ʻ0.MTH5351(s1);
                                        goto label_89;
                                    }
                                    break;
                                }
                                case 0x55FF298: {
                                    if(s5.equals("_OWN_")) {
                                        list1 = ʻ0.MTH5322(s1);
                                        goto label_89;
                                    }
                                }
                            }
                            list1 = Arrays.asList(CLS502.MTH6941(ˆʿ0.MTH1162(s5)));
                        }
                        else if(s5.equals("_MUTE_")) {
                            list1 = ʻ0.MTH5336(s1);
                        }
                        else {
                            list1 = Arrays.asList(CLS502.MTH6941(ˆʿ0.MTH1162(s5)));
                        }
                    label_89:
                        hashSet5.addAll(list1);
                        hashSet2.addAll(hashSet5);
                    }
                }
            }
        }
        for(Object object2: hashMap0.keySet()) {
            for(Object object3: ((HashSet)hashMap0.get(((String)object2)))) {
                String s6 = (String)object3;
                hashSet3.add(s6);
                if(hashMap1.containsKey(s6)) {
                    hashMap1.remove(s6);
                    hashSet2.add(s6);
                }
            }
        }
        if(!hashSet2.isEmpty()) {
            Iterator iterator5 = arrayList0.iterator();
            while(iterator5.hasNext()) {
                iterator5.next();
                if(hashSet2.contains("")) {
                    iterator5.remove();
                }
            }
            for(Object object4: hashSet2) {
                hashMap1.remove(((String)object4));
            }
        }
        this.FLD3290.clear();
        this.FLD3290.addAll(arrayList0);
        hashSet3.addAll(this.MTH5051());
        this.FLD3279.FLD300.put(s, hashSet3);
        this.MTH5050();
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.FLD3290.size();
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.FLD3290.get(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return 0L;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        CLS321 ˈˈ$ٴـ0;
        try {
            if(view0 == null) {
                ˈˈ$ٴـ0 = new CLS321();
                view0 = this.MTH5053(ˈˈ$ٴـ0);
                view0.setTag(ˈˈ$ٴـ0);
            }
            else {
                ˈˈ$ٴـ0 = (CLS321)view0.getTag();
            }
            this.MTH5052(ˈˈ$ٴـ0, v);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return view0;
    }

    public final void MTH5044() {
        if(this.FLD3293) {
            return;
        }
        this.FLD3293 = true;
        int v = this.getCount() >= 20 ? 3000 : 0;
        CLS1229 ˆٴ0 = new CLS1229(5, this);
        CLS40.FLD157.MTH1117(((CLS39)ˆٴ0), ((long)v));
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public final boolean MTH5045(String s) {
        return this.FLD3295.containsKey(s) && CLS166.MTH3181(this.FLD3295.get(s), "field_unReadCount") > 0;
    }

    // 此方法包含解密的字符串
    public final void MTH5046(String s) {
        HashMap hashMap0 = this.FLD3297;
        if(hashMap0.containsKey(s)) {
            hashMap0.remove(s);
            Iterator iterator0 = this.FLD3290.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                if("".equals(s)) {
                    iterator0.remove();
                }
            }
        }
    }

    public final void MTH5047(String s, ArrayList arrayList0) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        HashMap hashMap0 = this.FLD3297;
        if(!hashMap0.containsKey(s)) {
            return;
        }
        CLS78 ˊﾞ0 = (CLS78)hashMap0.get(s);
        if(arrayList0.contains(ˊﾞ0)) {
            return;
        }
        arrayList0.add(ˊﾞ0);
    }

    public final void MTH5048(Object object0, String s, long v, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2) {
        HashSet hashSet0;
        HashMap hashMap0;
        this.FLD3295.put(s, object0);
        if(this.FLD3287.contains(s)) {
            if(!arrayList0.contains(v)) {
                arrayList0.add(v);
            }
            hashMap0 = this.FLD3286;
            if(hashMap0.containsKey(v)) {
                ((HashSet)hashMap0.get(v)).add(s);
                return;
            }
        }
        else if(this.FLD3292.contains(s)) {
            if(!arrayList1.contains(v)) {
                arrayList1.add(v);
            }
            hashMap0 = this.FLD3302;
            if(hashMap0.containsKey(v)) {
                ((HashSet)hashMap0.get(v)).add(s);
                return;
            }
        }
        else {
            if(!arrayList2.contains(v)) {
                arrayList2.add(v);
            }
            hashMap0 = this.FLD3291;
            if(hashMap0.containsKey(v)) {
                ((HashSet)hashMap0.get(v)).add(s);
                return;
            }
        }
        hashSet0 = new HashSet();
        hashSet0.add(s);
        hashMap0.put(v, hashSet0);
    }

    // 此方法包含解密的字符串
    public final Drawable MTH5049() {
        String s = CLS21.FLD76.MTH826("getThemeString", new Object[]{"FragmentItemViewStickyBackgroundColor"});
        if(TextUtils.isEmpty(s)) {
            s = this.FLD3296;
        }
        Drawable drawable0 = this.FLD3298;
        if(drawable0 == null) {
            Drawable drawable1 = CLS518.MTH7062(CLS522.MTH7110(s));
            this.FLD3298 = drawable1;
            return drawable1;
        }
        Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
        return drawable$ConstantState0 == null ? CLS518.MTH7062(CLS522.MTH7110(s)) : drawable$ConstantState0.newDrawable().mutate();
    }

    // 此方法包含解密的字符串
    // This method was un-flattened
    public final void MTH5050() {
        HashMap hashMap4;
        Cursor cursor2;
        CLS371 ʻ1;
        HashSet hashSet1;
        int v5;
        int v4;
        CLS371 ʻ0;
        ArrayList arrayList7;
        ArrayList arrayList5;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap0 = this.FLD3291;
        hashMap0.clear();
        HashMap hashMap1 = this.FLD3286;
        hashMap1.clear();
        HashMap hashMap2 = this.FLD3302;
        hashMap2.clear();
        ArrayList arrayList3 = this.FLD3290;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        CLS79 ˎᵢ0 = this.FLD3279;
        ˎᵢ0.getClass();
        if(arrayList4.isEmpty()) {
            arrayList5 = null;
        }
        else {
            ArrayList arrayList6 = new ArrayList();
            for(Object object0: arrayList4) {
                if(((CLS78)object0) != null && CLS404.MTH5909("")) {
                    String s = "".substring(3);
                    if(!TextUtils.isEmpty(s)) {
                        switch(s) {
                            case "_GH_": {
                                arrayList7 = ˎᵢ0.MTH1636();
                                break;
                            }
                            case "_MUTE_": {
                                arrayList7 = ˎᵢ0.FLD280.MTH5336(CLS27.MTH904());
                                break;
                            }
                            case "_OWN_": {
                                arrayList7 = ˎᵢ0.FLD280.MTH5322(CLS27.MTH904());
                                break;
                            }
                            case "_WORK_": {
                                arrayList7 = ˎᵢ0.FLD280.MTH5351(CLS27.MTH904());
                                break;
                            }
                            default: {
                                String s1 = ˎᵢ0.MTH1644().MTH1162(s);
                                if(TextUtils.isEmpty(s1)) {
                                    continue;
                                }
                                ˎᵢ0.MTH1635(arrayList6, new ArrayList(Arrays.asList(CLS502.MTH6941(s1))), "");
                                continue;
                            }
                        }
                        ˎᵢ0.MTH1635(arrayList6, arrayList7, "");
                    }
                }
            }
            arrayList5 = arrayList6;
        }
        if(arrayList5 != null && !arrayList5.isEmpty()) {
            for(Object object1: arrayList5) {
                String s2 = (String)((Pair)object1).first;
                Object object2 = ((Pair)object1).second;
                this.MTH5048(object2, s2, (object2 == null ? 0L : CLS166.MTH3185(object2, "field_conversationTime")), arrayList0, arrayList1, arrayList2);
            }
        }
        HashSet hashSet0 = new HashSet();
        int v = arrayList4.size();
        int v1 = 0;
        while(true) {
            ʻ0 = this.FLD3282;
            if(v1 >= v) {
                break;
            }
            int v2 = v1 + 500;
            Cursor cursor0 = ʻ0.MTH5345(arrayList4.subList(v1, Math.min(v, v2)), false);
            if(cursor0 == null) {
            label_77:
                v4 = v2;
                v5 = v;
                hashSet1 = hashSet0;
            }
            else {
                Class class0 = CLS27.MTH894("ConversationItemClass");
                if(class0 == null) {
                    goto label_77;
                }
                else {
                    if(cursor0.moveToFirst()) {
                        while(true) {
                            Object object3 = CLS166.MTH3188(class0, new Object[0]);
                            CLS166.MTH3195(object3, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
                            long v3 = CLS166.MTH3185(object3, "field_conversationTime");
                            Object object4 = CLS166.MTH3194(object3, "field_username");
                            hashSet0.add(((String)object4));
                            v4 = v2;
                            v5 = v;
                            hashSet1 = hashSet0;
                            this.MTH5048(object3, ((String)object4), v3, arrayList0, arrayList1, arrayList2);
                            if(!cursor0.moveToNext()) {
                                break;
                            }
                            hashSet0 = hashSet1;
                            v = v5;
                            v2 = v4;
                        }
                    }
                    else {
                        v4 = v2;
                        v5 = v;
                        hashSet1 = hashSet0;
                    }
                    if(!cursor0.isClosed()) {
                        cursor0.close();
                    }
                }
            }
            hashSet0 = hashSet1;
            v = v5;
            v1 = v4;
        }
        HashMap hashMap3 = this.FLD3297;
        for(Object object5: hashMap3.keySet()) {
            String s3 = (String)object5;
            if(!hashSet0.contains(s3) && !CLS404.MTH5909(s3)) {
                Cursor cursor1 = ʻ0.MTH5300(s3);
                if(cursor1 == null) {
                    ʻ1 = ʻ0;
                    hashMap4 = hashMap3;
                }
                else {
                    Class class1 = CLS27.MTH894("ConversationItemClass");
                    if(class1 == null) {
                        ʻ1 = ʻ0;
                        hashMap4 = hashMap3;
                    }
                    else {
                        if(cursor1.moveToFirst()) {
                            while(true) {
                                Object object6 = CLS166.MTH3188(class1, new Object[0]);
                                String s4 = CLS182.MTH3472(0x38EBBE4D2B3CD335L, cursor1);
                                CLS166.MTH3190(cursor1.getLong(cursor1.getColumnIndex("createTime")), object6, "field_conversationTime");
                                CLS166.MTH3198(object6, "field_username", s4);
                                CLS166.MTH3198(object6, "field_msgType", cursor1.getString(cursor1.getColumnIndex("type")));
                                CLS166.MTH3198(object6, "field_content", cursor1.getString(cursor1.getColumnIndex("content")));
                                CLS166.MTH3198(object6, "field_digestUser", s4);
                                long v6 = CLS166.MTH3185(object6, "field_conversationTime");
                                Object object7 = CLS166.MTH3194(object6, "field_username");
                                hashSet0.add(((String)object7));
                                ʻ1 = ʻ0;
                                cursor2 = cursor1;
                                hashMap4 = hashMap3;
                                this.MTH5048(object6, ((String)object7), v6, arrayList0, arrayList1, arrayList2);
                                if(!cursor2.moveToNext()) {
                                    break;
                                }
                                ʻ0 = ʻ1;
                                cursor1 = cursor2;
                                hashMap3 = hashMap4;
                            }
                        }
                        else {
                            ʻ1 = ʻ0;
                            cursor2 = cursor1;
                            hashMap4 = hashMap3;
                        }
                        if(!cursor2.isClosed()) {
                            cursor2.close();
                        }
                    }
                }
                ʻ0 = ʻ1;
                hashMap3 = hashMap4;
            }
        }
        Collections.sort(arrayList0, Collections.reverseOrder());
        Collections.sort(arrayList2, Collections.reverseOrder());
        Collections.sort(arrayList1, Collections.reverseOrder());
        ArrayList arrayList8 = new ArrayList();
        boolean z = this.FLD3283.MTH938("container_show_empty", false);
        for(Object object8: arrayList0) {
            for(Object object9: ((HashSet)hashMap1.get(((long)(((Long)object8)))))) {
                this.MTH5047(((String)object9), arrayList8);
            }
        }
        HashSet hashSet2 = this.FLD3287;
        if(z) {
            for(Object object10: hashSet2) {
                String s5 = (String)object10;
                if(!CLS404.MTH5909(s5)) {
                    this.MTH5047(s5, arrayList8);
                }
            }
        }
        for(Object object11: arrayList2) {
            for(Object object12: ((HashSet)hashMap0.get(((long)(((Long)object11)))))) {
                this.MTH5047(((String)object12), arrayList8);
            }
        }
        HashSet hashSet3 = this.FLD3292;
        if(z) {
            for(Object object13: hashMap3.keySet()) {
                String s6 = (String)object13;
                if(!CLS404.MTH5909(s6) && !hashSet2.contains(s6) && !hashSet3.contains(s6)) {
                    this.MTH5047(s6, arrayList8);
                }
            }
        }
        for(Object object14: arrayList1) {
            for(Object object15: ((HashSet)hashMap2.get(((long)(((Long)object14)))))) {
                this.MTH5047(((String)object15), arrayList8);
            }
        }
        if(z) {
            for(Object object16: hashSet3) {
                String s7 = (String)object16;
                if(!CLS404.MTH5909(s7)) {
                    this.MTH5047(s7, arrayList8);
                }
            }
        }
        Iterator iterator12 = arrayList8.iterator();
        while(iterator12.hasNext()) {
            Object object17 = iterator12.next();
            if(((CLS78)object17) == null) {
                iterator12.remove();
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList8);
        this.FLD3293 = false;
        CLS322 ˈˈ$ᵔʾ0 = this.FLD3285;
        if(ˈˈ$ᵔʾ0 != null) {
            ((CLS581)ˈˈ$ᵔʾ0).FLD245.getClass();
            CLS1262 ﾞˎ0 = new CLS1262(((CLS581)ˈˈ$ᵔʾ0).FLD245, arrayList3.size(), 7);
            CLS40.FLD157.MTH1116(((CLS39)ﾞˎ0));
        }
        this.notifyDataSetChanged();
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH5051() {
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = this.FLD3290.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            if(!CLS404.MTH5909("")) {
                arrayList0.add("");
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final void MTH5052(CLS321 ˈˈ$ٴـ0, int v) {
        public final class CLS320 extends Shape {
            public CLS320() {
                super();
            }

            @Override  // android.graphics.drawable.shapes.Shape
            public final void draw(Canvas canvas0, Paint paint0) {
                int v = canvas0.getWidth();
                paint0.setAntiAlias(true);
                paint0.setColor(0xFFFF0000);
                paint0.setStyle(Paint.Style.FILL_AND_STROKE);
                float f = (float)(v / 2);
                canvas0.drawCircle(f, f, f, paint0);
            }
        }

        Bitmap bitmap1;
        Drawable drawable1;
        try {
            CLS29 ˎᵢ0 = this.FLD3283;
            if(((CLS78)this.getItem(v)) == null || true) {
                ˈˈ$ٴـ0.FLD3275.setText("----");
                ˈˈ$ٴـ0.FLD3273.setText("");
                ˈˈ$ٴـ0.FLD3274.setText("");
                ˈˈ$ٴـ0.FLD3272.setImageDrawable(null);
                return;
            }
            ˈˈ$ٴـ0.FLD3275.setText("");
            Object object0 = this.FLD3295.containsKey("") ? this.FLD3295.get("") : null;
            boolean z = CLS404.MTH5909("");
            String s = ˎᵢ0.MTH925("custom_avatar_list", "");
            if(object0 == null) {
                CLS66.MTH1461(ˈˈ$ٴـ0.FLD3272, "");
                ˈˈ$ٴـ0.FLD3273.setText("");
                ˈˈ$ٴـ0.FLD3274.setText("");
                ˈˈ$ٴـ0.FLD3271.setVisibility(8);
                ˈˈ$ٴـ0.FLD3278.setVisibility(8);
                ˈˈ$ٴـ0.FLD3276.setVisibility(8);
            }
            else {
                int v1 = CLS166.MTH3181(object0, "field_unReadCount");
                boolean z1 = CLS372.MTH5396("");
                if(z) {
                    if(v1 > 0) {
                        ˈˈ$ٴـ0.FLD3273.setText(String.format(CLS27.MTH889("unread_chatrooms"), v1));
                    }
                    else {
                        ˈˈ$ٴـ0.FLD3273.setText("");
                    }
                    v1 = CLS166.MTH3181(object0, "field_unReadMuteCount");
                    String s1 = (String)CLS166.MTH3194(object0, "field_username");
                    if(CLS502.MTH6934(s, new String[]{""})) {
                        CLS66.MTH1461(ˈˈ$ٴـ0.FLD3272, "");
                    }
                    else {
                        CLS66.MTH1461(ˈˈ$ٴـ0.FLD3272, s1);
                    }
                }
                else {
                    CLS1267 ˆʿ0 = new CLS1267(this, ˈˈ$ٴـ0, object0, 0);
                    CLS40.FLD157.MTH1116(((CLS39)ˆʿ0));
                    CLS66.MTH1461(ˈˈ$ٴـ0.FLD3272, "");
                }
                CLS1267 ˆʿ1 = new CLS1267(this, ˈˈ$ٴـ0, object0, 1);
                CLS40.FLD157.MTH1116(((CLS39)ˆʿ1));
                if(!z1 || this.FLD3284.equals("wx__MUTE_")) {
                    ˈˈ$ٴـ0.FLD3276.setVisibility(8);
                }
                else {
                    ˈˈ$ٴـ0.FLD3276.setVisibility(0);
                    String s2 = CLS27.MTH897("muteIconId");
                    if(!TextUtils.isEmpty(s2)) {
                        ImageView imageView0 = ˈˈ$ٴـ0.FLD3276;
                        Context context0 = (Context)this.FLD3300.get();
                        int v2 = Integer.parseInt(s2);
                        Drawable drawable0 = context0.getResources().getDrawable(v2);
                        if(drawable0 != null) {
                            drawable0.setColorFilter(new PorterDuffColorFilter(0x7F06014C, PorterDuff.Mode.SRC_ATOP));
                        }
                        imageView0.setImageDrawable(drawable0);
                    }
                }
                if(v1 > 0) {
                    if(z && !z1 && !ˎᵢ0.MTH938("wx_container_show_unread_" + "", true)) {
                        z1 = true;
                    }
                    if(z1) {
                        ˈˈ$ٴـ0.FLD3271.setVisibility(0);
                        ˈˈ$ٴـ0.FLD3278.setVisibility(8);
                        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new CLS320());
                        CLS523.MTH7152(ˈˈ$ٴـ0.FLD3271, shapeDrawable0);
                    }
                    else {
                        ˈˈ$ٴـ0.FLD3271.setVisibility(8);
                        ˈˈ$ٴـ0.FLD3278.setVisibility(0);
                        GradientDrawable gradientDrawable0 = new GradientDrawable();
                        gradientDrawable0.setCornerRadius(((float)CLS523.MTH7137(8)));
                        gradientDrawable0.setColor(0xFFFF0000);
                        CLS523.MTH7152(ˈˈ$ٴـ0.FLD3278, gradientDrawable0);
                        ˈˈ$ٴـ0.FLD3278.setText((v1 > 99 ? "..." : String.valueOf(v1)));
                        ˈˈ$ٴـ0.FLD3278.setGravity(17);
                        ˈˈ$ٴـ0.FLD3278.setTextSize(10.0f);
                        ˈˈ$ٴـ0.FLD3278.setTypeface(null, 1);
                    }
                }
                else {
                    ˈˈ$ٴـ0.FLD3278.setVisibility(8);
                    ˈˈ$ٴـ0.FLD3271.setVisibility(8);
                }
            }
            boolean z2 = this.FLD3287.contains("");
            boolean z3 = this.FLD3294;
            if(z2) {
                drawable1 = z3 ? this.MTH5049() : this.MTH5054(CLS522.MTH7110(CLS370.MTH5289((CLS522.MTH7114() ? 4101582107845645109L : 0x38EBBF3A2B3CD335L))));
            }
            else if(!this.FLD3292.contains("")) {
                drawable1 = this.MTH5055();
            }
            else if(z3) {
                drawable1 = this.MTH5049();
            }
            else {
                drawable1 = this.MTH5054(CLS522.MTH7110(CLS370.MTH5289((CLS522.MTH7114() ? 0x38EBBFC22B3CD335L : 4101582760680674101L))));
            }
            CLS523.MTH7152(ˈˈ$ٴـ0.FLD3277, drawable1);
            if(ˎᵢ0.MTH938("chatroom_container_round_avatar", false)) {
                if(!z) {
                    bitmap1 = CLS372.MTH5411("");
                }
                else if(object0 != null) {
                    String s3 = (String)CLS166.MTH3194(object0, "field_username");
                    Bitmap bitmap0 = CLS502.MTH6934(s, new String[]{""}) ? CLS372.MTH5402(0x60, 0x60, "") : null;
                    bitmap1 = bitmap0 == null ? CLS372.MTH5411(s3) : bitmap0;
                }
                else {
                    bitmap1 = null;
                }
                if(bitmap1 != null) {
                    ˈˈ$ٴـ0.FLD3272.setImageBitmap(CLS518.MTH7070(bitmap1));
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            ˈˈ$ٴـ0.FLD3275.setText("----");
            ˈˈ$ٴـ0.FLD3273.setText("");
            ˈˈ$ٴـ0.FLD3274.setText("");
            ˈˈ$ٴـ0.FLD3272.setImageDrawable(null);
        }
    }

    // 此方法包含解密的字符串
    public final RelativeLayout MTH5053(CLS321 ˈˈ$ٴـ0) {
        int v1;
        int v;
        Activity activity0 = (Activity)this.FLD3300.get();
        RelativeLayout relativeLayout0 = new RelativeLayout(activity0);
        RelativeLayout relativeLayout1 = new RelativeLayout(activity0);
        RelativeLayout relativeLayout2 = new RelativeLayout(activity0);
        ImageView imageView0 = new ImageView(activity0);
        TextView textView0 = new TextView(activity0);
        TextView textView1 = new TextView(activity0);
        LinearLayout linearLayout0 = new LinearLayout(activity0);
        ImageView imageView1 = new ImageView(activity0);
        imageView1.setScaleType(ImageView.ScaleType.FIT_XY);
        TextView textView2 = new TextView(activity0);
        TextView textView3 = new TextView(activity0);
        TextView textView4 = new TextView(activity0);
        View view0 = new View(activity0);
        imageView0.setId(CLS523.MTH7138());
        relativeLayout2.setId(CLS523.MTH7138());
        textView0.setId(CLS523.MTH7138());
        textView1.setId(CLS523.MTH7138());
        imageView1.setId(CLS523.MTH7138());
        textView2.setId(CLS523.MTH7138());
        textView3.setId(CLS523.MTH7138());
        textView4.setId(CLS523.MTH7138());
        CLS21 ʾᵢ0 = CLS21.FLD76;
        if(ʾᵢ0.MTH830("isThemeEnable", new Object[]{"FragmentItemViewTitleColorEnable"})) {
            String s = ʾᵢ0.MTH826("getThemeString", new Object[]{"FragmentItemViewTitleColor"});
            if(!TextUtils.isEmpty(s)) {
                v = CLS522.MTH7110(s);
                goto label_29;
            }
            goto label_28;
        }
        else {
        label_28:
            v = CLS522.MTH7114() ? CLS522.MTH7110("#D3D3D3") : -13290187;
        }
    label_29:
        textView0.setTextColor(v);
        textView2.setTextColor(CLS323.MTH5056());
        textView1.setTextColor(CLS323.MTH5056());
        textView3.setTextColor(-1);
        textView4.setTextColor(-1);
        if(this.FLD3294) {
            v1 = 0;
        }
        else {
            v1 = CLS522.MTH7114() ? CLS522.MTH7110("#2B2B2B") : 0xFFDADADA;
        }
        view0.setBackgroundColor(v1);
        textView0.setTextSize(2, 16.0f);
        textView2.setTextSize(2, 13.0f);
        textView1.setTextSize(2, 12.0f);
        textView4.setTextSize(2, 12.0f);
        textView3.setTextSize(2, 12.0f);
        textView0.setEllipsize(TextUtils.TruncateAt.END);
        textView0.setMaxEms(12);
        textView0.setSingleLine();
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout0.setOrientation(0);
        linearLayout0.setLayoutParams(linearLayout$LayoutParams0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(CLS523.MTH7137(72), CLS523.MTH7137(0x40));
        relativeLayout$LayoutParams0.addRule(9);
        relativeLayout$LayoutParams0.addRule(15);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(CLS523.MTH7137(0x30), CLS523.MTH7137(0x30));
        relativeLayout$LayoutParams1.addRule(13);
        relativeLayout2.addView(imageView0, relativeLayout$LayoutParams1);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.setMargins(0, CLS523.MTH7137(10), 0, 0);
        relativeLayout$LayoutParams2.addRule(1, relativeLayout2.getId());
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams3.setMargins(CLS523.MTH7137(12), CLS523.MTH7137(12), CLS523.MTH7137(12), CLS523.MTH7137(12));
        relativeLayout$LayoutParams3.addRule(11);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams4.addRule(12);
        relativeLayout$LayoutParams4.addRule(1, relativeLayout2.getId());
        linearLayout0.setPadding(0, 0, 0, CLS523.MTH7137(12));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(CLS523.MTH7137(12), CLS523.MTH7137(12));
        relativeLayout$LayoutParams5.addRule(11);
        relativeLayout$LayoutParams5.addRule(1, linearLayout0.getId());
        relativeLayout$LayoutParams5.addRule(3, textView1.getId());
        relativeLayout$LayoutParams5.setMargins(0, 0, CLS523.MTH7137(12), CLS523.MTH7137(12));
        imageView1.setVisibility(8);
        textView4.setVisibility(8);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxEms(15);
        textView2.setSingleLine();
        RelativeLayout.LayoutParams relativeLayout$LayoutParams6 = new RelativeLayout.LayoutParams(CLS523.MTH7137(10), CLS523.MTH7137(10));
        relativeLayout$LayoutParams6.addRule(7, relativeLayout2.getId());
        relativeLayout$LayoutParams6.addRule(6, relativeLayout2.getId());
        relativeLayout$LayoutParams6.setMargins(0, CLS523.MTH7137(5), CLS523.MTH7137(7), 0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams7 = new RelativeLayout.LayoutParams(CLS523.MTH7137(16), CLS523.MTH7137(16));
        relativeLayout$LayoutParams7.addRule(7, relativeLayout2.getId());
        relativeLayout$LayoutParams7.addRule(6, relativeLayout2.getId());
        relativeLayout$LayoutParams7.setMargins(0, CLS523.MTH7137(5), CLS523.MTH7137(7), 0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams8 = new RelativeLayout.LayoutParams(-1, 1);
        relativeLayout$LayoutParams8.addRule(12);
        linearLayout0.addView(textView2, linearLayout$LayoutParams0);
        relativeLayout1.addView(relativeLayout2, relativeLayout$LayoutParams0);
        relativeLayout1.addView(textView0, relativeLayout$LayoutParams2);
        relativeLayout1.addView(textView1, relativeLayout$LayoutParams3);
        relativeLayout1.addView(linearLayout0, relativeLayout$LayoutParams4);
        relativeLayout1.addView(imageView1, relativeLayout$LayoutParams5);
        relativeLayout1.addView(textView3, relativeLayout$LayoutParams6);
        relativeLayout1.addView(textView4, relativeLayout$LayoutParams7);
        relativeLayout1.addView(view0, relativeLayout$LayoutParams8);
        relativeLayout0.addView(relativeLayout1, new ViewGroup.LayoutParams(-1, -1));
        ˈˈ$ٴـ0.FLD3272 = imageView0;
        ˈˈ$ٴـ0.FLD3273 = textView2;
        ˈˈ$ٴـ0.FLD3276 = imageView1;
        ˈˈ$ٴـ0.FLD3275 = textView0;
        ˈˈ$ٴـ0.FLD3274 = textView1;
        ˈˈ$ٴـ0.FLD3278 = textView4;
        ˈˈ$ٴـ0.FLD3271 = textView3;
        ˈˈ$ٴـ0.FLD3277 = relativeLayout0;
        return relativeLayout0;
    }

    public final Drawable MTH5054(int v) {
        HashMap hashMap0 = this.FLD3299;
        if(hashMap0.containsKey(v)) {
            Drawable.ConstantState drawable$ConstantState0 = ((Drawable)hashMap0.get(v)).getConstantState();
            return drawable$ConstantState0 == null ? CLS518.MTH7062(v) : drawable$ConstantState0.newDrawable().mutate();
        }
        Drawable drawable0 = CLS518.MTH7062(v);
        hashMap0.put(v, drawable0);
        return drawable0;
    }

    // 此方法包含解密的字符串
    public final Drawable MTH5055() {
        if(this.FLD3294) {
            String s = CLS21.FLD76.MTH826("getThemeString", new Object[]{"FragmentItemViewBackgroundColor"});
            if(TextUtils.isEmpty(s)) {
                s = this.FLD3288;
            }
            Drawable drawable0 = this.FLD3289;
            if(drawable0 == null) {
                Drawable drawable1 = CLS518.MTH7062(CLS522.MTH7110(s));
                this.FLD3289 = drawable1;
                return drawable1;
            }
            Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
            return drawable$ConstantState0 == null ? CLS518.MTH7062(CLS522.MTH7110(s)) : drawable$ConstantState0.newDrawable().mutate();
        }
        return CLS522.MTH7114() ? this.MTH5054(CLS522.MTH7110("#232323")) : this.MTH5054(CLS522.MTH7110("#FFFFFF"));
    }

    // 去混淆评级： 低(23)
    // 此方法包含解密的字符串
    public static int MTH5056() {
        CLS21 ʾᵢ0 = CLS21.FLD76;
        if(ʾᵢ0.MTH830("isThemeEnable", new Object[]{"FragmentItemViewTitleColorEnable"})) {
            String s = ʾᵢ0.MTH826("getThemeString", new Object[]{"FragmentItemViewSubTitleColor"});
            if(!TextUtils.isEmpty(s)) {
                return CLS522.MTH7110(s);
            }
        }
        return CLS522.MTH7114() ? CLS522.MTH7110("#656565") : -5592406;
    }
}

