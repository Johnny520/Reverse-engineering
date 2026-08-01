// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.database.Cursor;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS79;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS239 implements View.OnClickListener {
    public final int FLD2355;
    public final Activity FLD2356;
    public final CLS1019 FLD2357;
    public final CLS79 FLD2358;

    public CLS239(CLS1019 ˎʻ0, Activity activity0, CLS79 ˎᵢ0, int v) {
        this.FLD2355 = v;
        this.FLD2357 = ˎʻ0;
        this.FLD2356 = activity0;
        this.FLD2358 = ˎᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1019 ˎʻ0 = this.FLD2357;
        CLS79 ˎᵢ0 = this.FLD2358;
        switch(this.FLD2355) {
            case 0: {
                try {
                    Activity activity1 = this.FLD2356;
                    CLS29 ˎᵢ1 = ˎʻ0.FLD2151;
                    CLS371 ʻ1 = ˎʻ0.FLD2092;
                    HashSet hashSet0 = new HashSet();
                    hashSet0.addAll(Arrays.asList(CLS502.MTH6941(ˎᵢ1.MTH925("chatroom_container_list", ""))));
                    hashSet0.addAll(ʻ1.MTH5363());
                    ArrayList arrayList1 = new ArrayList();
                    HashSet hashSet1 = new HashSet();
                    Cursor cursor0 = ʻ1.MTH5307("select * from rconversation where username not like \'%@%\' and username not like \'gh^_%\' ESCAPE \'^\' and username not like \'wxid^_%\' ESCAPE \'^\' and username not like \'wx^_%\' ESCAPE \'^\' and username != \'officialaccounts\' and username != \'qmessage\' and username != \'floatbottle\' and (parentref is null or parentref = \'\')", null);
                    if(cursor0 != null) {
                        if(cursor0.moveToFirst()) {
                            while(true) {
                                hashSet1.add(cursor0.getString(cursor0.getColumnIndex("username")));
                                if(!cursor0.moveToNext()) {
                                    break;
                                }
                            }
                        }
                        if(!cursor0.isClosed()) {
                            cursor0.close();
                        }
                    }
                    for(Object object1: hashSet1) {
                        String s = (String)object1;
                        if(!hashSet0.contains(s) && ʻ1.MTH5382(s)) {
                            arrayList1.add(new CLS78(s, ʻ1.MTH5311(s)));
                        }
                    }
                    CLS387.MTH5585(true, activity1, arrayList1, ((CLS2)new CLS1163(ˎʻ0, ˎᵢ0)), ˎᵢ1.MTH925("include_public_accounts_list", ""), -1);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                ArrayList arrayList2 = ˎʻ0.FLD2091;
                CLS1121 ᴵ0 = new CLS1121(ˎʻ0, ˎᵢ0);
                String s1 = ˎʻ0.FLD2151.MTH925("chatroom_container_tags", "");
                CLS523.MTH7144(this.FLD2356, ((CLS8)ᴵ0), s1, arrayList2);
                return;
            }
            case 2: {
                CLS1160 ᵢʼ0 = new CLS1160(ˎʻ0, ˎᵢ0);
                String s2 = ˎʻ0.FLD2151.MTH925("chatroom_container_list", "");
                CLS387.MTH5585(true, this.FLD2356, ˎʻ0.FLD2087, ((CLS2)ᵢʼ0), s2, -1);
                return;
            }
            default: {
                try {
                    Activity activity0 = this.FLD2356;
                    CLS371 ʻ0 = ˎʻ0.FLD2092;
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: ʻ0.MTH5363()) {
                        arrayList0.add(new CLS78(((String)object0), ʻ0.MTH5311(((String)object0))));
                    }
                    CLS387.MTH5585(true, activity0, arrayList0, ((CLS2)new CLS906(ˎʻ0, ˎᵢ0)), ˎʻ0.FLD2151.MTH925("exclude_public_accounts_list", ""), -1);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

