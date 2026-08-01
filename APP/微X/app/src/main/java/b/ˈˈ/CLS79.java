// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS38.CLS37;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS43;
import b.ˆʿ.CLS56;
import b.ˆٴ.CLS66;
import b.ˊﾞ.CLS612;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1255;
import b.ᵔʾ.CLS1259;
import b.ⁱʾ.CLS1265;
import b.ⁱʾ.CLS323;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS425;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS79 {
    public final HashSet FLD279;
    public final CLS371 FLD280;
    public final HashSet FLD281;
    public final HashSet FLD282;
    public Method FLD283;
    public HashSet FLD284;
    public final HashMap FLD285;
    public String FLD286;
    public CLS56 FLD287;
    public CLS29 FLD288;
    public CLS500 FLD289;
    public final ArrayDeque FLD290;
    public String FLD291;
    public static final CLS79 FLD292;
    public Method FLD293;
    public final HashMap FLD294;
    public String FLD295;
    public final HashSet FLD296;
    public CLS43 FLD297;
    public HashSet FLD298;
    public boolean FLD299;
    public final HashMap FLD300;
    public final int FLD301;

    static {
        CLS79.FLD292 = new CLS79();
    }

    // 此方法包含解密的字符串
    public CLS79() {
        this.FLD286 = "";
        this.FLD291 = "";
        this.FLD295 = "";
        this.FLD280 = CLS371.FLD3470;
        this.FLD281 = new HashSet();
        this.FLD282 = new HashSet();
        this.FLD294 = new HashMap();
        this.FLD290 = new ArrayDeque();
        this.FLD298 = new HashSet();
        this.FLD296 = new HashSet();
        this.FLD300 = new HashMap();
        this.FLD285 = new HashMap();
        this.FLD279 = new HashSet();
        this.FLD301 = CLS523.MTH7137(13);
        CLS585 ﾞᵎ0 = new CLS585(this, 0);
        CLS21.FLD76.MTH833("getChatroomContainers", ((CLS37)ﾞᵎ0));
        CLS585 ﾞᵎ1 = new CLS585(this, 1);
        CLS21.FLD76.MTH833("getContainerName", ((CLS37)ﾞᵎ1));
        CLS585 ﾞᵎ2 = new CLS585(this, 2);
        CLS21.FLD76.MTH833("getContainerContent", ((CLS37)ﾞᵎ2));
        CLS585 ﾞᵎ3 = new CLS585(this, 3);
        CLS21.FLD76.MTH833("getChatroomTag_chatrooms", ((CLS37)ﾞᵎ3));
    }

    // 此方法包含解密的字符串
    public final void MTH1615(String s, JSONObject jSONObject0, HashSet hashSet0) {
        if(hashSet0 == null) {
            hashSet0 = this.MTH1622(s);
        }
        if(jSONObject0.has("username")) {
            return;
        }
        Cursor cursor0 = this.FLD280.MTH5320(hashSet0);
        if(cursor0 == null) {
            return;
        }
        if(cursor0.getCount() > 0 && cursor0.moveToFirst()) {
            String s1 = CLS182.MTH3472(4101541322836202293L, cursor0);
            long v = CLS34.MTH1076(4101541361490907957L, cursor0);
            try {
                if(!TextUtils.isEmpty(s1)) {
                    jSONObject0.put("username", s1);
                }
                jSONObject0.put("conversationTime", v);
                this.MTH1651(s, jSONObject0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
    }

    // 此方法包含解密的字符串
    public final HashSet MTH1616() {
        HashSet hashSet0 = new HashSet();
        String s = this.MTH1624();
        CLS29 ˎᵢ0 = this.MTH1643();
        String[] arr_s = CLS502.MTH6941(s);
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(s1.startsWith("wx__c_")) {
                hashSet0.addAll(Arrays.asList(CLS502.MTH6941(ˎᵢ0.MTH925(s1, ""))));
            }
        }
        return hashSet0;
    }

    // 此方法包含解密的字符串
    public final void MTH1617() {
        boolean z = this.MTH1643().MTH938("chatroom_container", false);
        boolean z1 = this.MTH1643().MTH938("chatcontainer_enable", false);
        if(z) {
            this.FLD284 = this.MTH1636();
            HashSet hashSet0 = new HashSet();
            if(!this.MTH1643().MTH938("chatroom_container_all_enable", true)) {
                hashSet0.addAll(Arrays.asList(CLS502.MTH6941(this.MTH1643().MTH925("chatroom_container_list", ""))));
                boolean z2 = this.MTH1643().MTH938("chatroom_container_work_enable", false);
                CLS371 ʻ0 = this.FLD280;
                if(z2) {
                    hashSet0.addAll(ʻ0.MTH5351(CLS27.MTH904()));
                }
                if(this.MTH1643().MTH938("chatroom_container_mute_enable", false)) {
                    hashSet0.addAll(ʻ0.MTH5336(CLS27.MTH904()));
                }
                if(this.MTH1643().MTH938("chatroom_container_own_enable", false)) {
                    hashSet0.addAll(ʻ0.MTH5322(CLS27.MTH904()));
                }
                if(this.MTH1643().MTH938("chatroom_container_public_enable", false)) {
                    hashSet0.addAll(this.MTH1636());
                }
                if(this.MTH1648().MTH6895("chatroom_container_tags") && this.MTH1643().MTH938("chatroom_container_tag_enable", false)) {
                    for(Object object0: new HashSet(Arrays.asList(CLS502.MTH6941(this.MTH1643().MTH925("chatroom_container_tags", ""))))) {
                        hashSet0.addAll(Arrays.asList(CLS502.MTH6941(this.MTH1644().MTH1162(((String)object0)))));
                    }
                }
                Iterator iterator1 = hashSet0.iterator();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    if(!CLS371.FLD3470.MTH5383(((String)object1))) {
                        iterator1.remove();
                    }
                }
            }
            this.FLD298 = hashSet0;
            if(!this.FLD284.isEmpty()) {
                this.FLD286 = " and rconversation.username not in (\'" + TextUtils.join("\',\'", this.FLD284) + "\')";
            }
            this.FLD291 = " and rconversation.username not in (\'" + TextUtils.join("\',\'", this.FLD298) + "\')";
            HashSet hashSet1 = this.FLD296;
            hashSet1.clear();
            if(!this.MTH1643().MTH938("chatroom_container_all_enable", true)) {
                hashSet1.addAll(this.FLD298);
            }
            if(this.MTH1643().MTH938("chatroom_container_public_enable", false)) {
                hashSet1.addAll(this.FLD284);
            }
        }
        this.MTH1627();
        CLS29 ˎᵢ0 = this.MTH1643();
        String s = ˎᵢ0.MTH925("wx_chatroom_container", "");
        if(!TextUtils.isEmpty(s)) {
            CLS66.MTH1436(s, CLS27.MTH904());
            ˎᵢ0.MTH922("", "wx_chatroom_container");
        }
        if(z || z1) {
            this.MTH1633();
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1618(String s, Collection collection0) {
        if(collection0.isEmpty()) {
            return;
        }
        CLS29 ˎᵢ0 = this.MTH1643();
        if(ˎᵢ0 == null) {
            return;
        }
        HashSet hashSet0 = this.MTH1655(s);
        hashSet0.removeAll(collection0);
        ˎᵢ0.MTH922(TextUtils.join(",", hashSet0), s);
    }

    // 此方法包含解密的字符串
    public final void MTH1619() {
        try {
            boolean z = this.MTH1643().MTH938("chatroom_container", false);
            boolean z1 = this.MTH1643().MTH938("chatcontainer_enable", false);
            if(z) {
                this.MTH1638("wx__MAIN_");
            }
            else {
                this.MTH1657("wx__MAIN_");
            }
            String s = this.MTH1624();
            HashSet hashSet0 = new HashSet();
            if(!TextUtils.isEmpty(s)) {
                hashSet0.addAll(Arrays.asList(CLS502.MTH6941(s)));
            }
            if(!z) {
                hashSet0.remove("wx__MAIN_");
                hashSet0.remove("wx__WORK_");
                hashSet0.remove("wx__MUTE_");
                hashSet0.remove("wx__OWN_");
                hashSet0.remove("wx__GH_");
                for(Object object0: this.MTH1644().MTH1165()) {
                    hashSet0.remove("wx_" + ((String)object0));
                }
            }
            CLS371 ʻ0 = this.FLD280;
            if(z && this.MTH1639()) {
                String s1 = CLS27.MTH904();
                hashSet0.add("wx__MAIN_");
                hashSet0.remove("wx__WORK_");
                if(this.MTH1643().MTH938("chatroom_container_work_enable", false)) {
                    ArrayList arrayList0 = ʻ0.MTH5351(s1);
                    this.MTH1656(arrayList0);
                    if(!arrayList0.isEmpty()) {
                        hashSet0.add("wx__WORK_");
                    }
                }
                hashSet0.remove("wx__MUTE_");
                if(this.MTH1643().MTH938("chatroom_container_mute_enable", false)) {
                    ArrayList arrayList1 = ʻ0.MTH5336(s1);
                    this.MTH1656(arrayList1);
                    if(!arrayList1.isEmpty()) {
                        hashSet0.add("wx__MUTE_");
                    }
                }
                hashSet0.remove("wx__OWN_");
                if(this.MTH1643().MTH938("chatroom_container_own_enable", false)) {
                    ArrayList arrayList2 = ʻ0.MTH5322(s1);
                    this.MTH1656(arrayList2);
                    if(!arrayList2.isEmpty()) {
                        hashSet0.add("wx__OWN_");
                    }
                }
                hashSet0.remove("wx__GH_");
                if(this.MTH1643().MTH938("chatroom_container_public_enable", false)) {
                    HashSet hashSet1 = this.MTH1636();
                    this.MTH1656(hashSet1);
                    if(!hashSet1.isEmpty()) {
                        hashSet0.add("wx__GH_");
                    }
                }
                if(!this.MTH1648().MTH6895("chatroom_container_tags") || !this.MTH1643().MTH938("chatroom_container_tag_enable", false)) {
                    for(Object object1: this.MTH1644().MTH1165()) {
                        hashSet0.remove("wx_" + ((String)object1));
                    }
                }
                else {
                    ArrayList arrayList3 = this.MTH1644().MTH1165();
                    for(Object object2: arrayList3) {
                        hashSet0.remove("wx_" + ((String)object2));
                    }
                    HashSet hashSet2 = new HashSet(Arrays.asList(this.MTH1643().MTH925("chatroom_container_tags", "").split(",")));
                    for(Object object3: arrayList3) {
                        String s2 = (String)object3;
                        if(hashSet2.contains(s2)) {
                            ArrayList arrayList4 = new ArrayList(Arrays.asList(CLS502.MTH6941(this.MTH1644().MTH1162(s2))));
                            this.MTH1656(arrayList4);
                            if(!arrayList4.isEmpty()) {
                                hashSet0.add("wx_" + s2);
                            }
                        }
                    }
                }
            }
            this.MTH1643().MTH922(TextUtils.join(",", hashSet0), "wx_chatroom_containers");
            HashSet hashSet3 = ʻ0.MTH5324(hashSet0);
            if(!hashSet3.isEmpty()) {
                for(Object object4: hashSet3) {
                    String s3 = (String)object4;
                    if(!hashSet0.contains(s3)) {
                        this.MTH1657(s3);
                    }
                }
            }
            for(Object object5: hashSet0) {
                String s4 = (String)object5;
                if(!s4.startsWith("wx__c_")) {
                    if(z && (this.MTH1639() || this.MTH1658(s4))) {
                        this.MTH1638(s4);
                        continue;
                    }
                }
                else if(z1 && !this.MTH1625(s4).startsWith("_c_")) {
                    this.MTH1638(s4);
                    continue;
                }
                this.MTH1657(s4);
            }
            this.MTH1633();
            this.MTH1617();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final void MTH1620(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s1);
        this.MTH1646(s, arrayList0);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Object MTH1621() {
        return CLS21.FLD76.MTH836("convAdapter", new Object[0]);
    }

    // 此方法包含解密的字符串
    public final HashSet MTH1622(String s) {
        int v;
        HashMap hashMap0 = this.FLD300;
        if(hashMap0.containsKey(s)) {
            return (HashSet)hashMap0.get(s);
        }
        String s1 = s.substring(3);
        HashSet hashSet0 = new HashSet();
        switch(s1) {
            case "_GH_": {
                v = 3;
                break;
            }
            case "_MAIN_": {
                v = 0;
                break;
            }
            case "_MUTE_": {
                v = 2;
                break;
            }
            case "_OWN_": {
                v = 1;
                break;
            }
            case "_WORK_": {
                v = 4;
                break;
            }
            default: {
                v = -1;
            }
        }
        CLS371 ʻ0 = this.FLD280;
    alab1:
        switch(v) {
            case 0: {
                HashSet hashSet1 = new HashSet(Arrays.asList(CLS502.MTH6941(this.MTH1624())));
                HashSet hashSet2 = new HashSet();
                if(this.MTH1643().MTH938("chatroom_container_mute_enable", false)) {
                    if(hashSet1.contains("wx__MUTE_")) {
                        hashSet2.addAll(ʻ0.MTH5336(CLS27.MTH904()));
                    }
                    else {
                        hashSet0.addAll(ʻ0.MTH5336(CLS27.MTH904()));
                    }
                }
                if(this.MTH1643().MTH938("chatroom_container_work_enable", false)) {
                    if(hashSet1.contains("wx__WORK_")) {
                        hashSet2.addAll(ʻ0.MTH5351(CLS27.MTH904()));
                    }
                    else {
                        hashSet0.addAll(ʻ0.MTH5351(CLS27.MTH904()));
                    }
                }
                if(this.MTH1643().MTH938("chatroom_container_own_enable", false)) {
                    if(hashSet1.contains("wx__OWN_")) {
                        hashSet2.addAll(ʻ0.MTH5322(CLS27.MTH904()));
                    }
                    else {
                        hashSet0.addAll(ʻ0.MTH5322(CLS27.MTH904()));
                    }
                }
                if(this.MTH1643().MTH938("chatroom_container_public_enable", false)) {
                    if(hashSet1.contains("wx__GH_")) {
                        hashSet2.addAll(this.MTH1636());
                    }
                    else {
                        hashSet0.addAll(this.MTH1636());
                    }
                }
                if(this.MTH1648().MTH6895("chatroom_container_tags") && this.MTH1643().MTH938("chatroom_container_tag_enable", false)) {
                    ArrayList arrayList0 = this.MTH1644().MTH1165();
                    HashSet hashSet3 = new HashSet(Arrays.asList(CLS502.MTH6941(this.MTH1643().MTH925("chatroom_container_tags", ""))));
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object0: arrayList0) {
                        String s3 = (String)object0;
                        if(!hashSet3.contains(s3)) {
                        }
                        else if(hashSet1.contains("wx_" + s3)) {
                            hashSet2.addAll(Arrays.asList(CLS502.MTH6941(this.MTH1644().MTH1162(s3))));
                        }
                        else {
                            arrayList1.addAll(Arrays.asList(CLS502.MTH6941(this.MTH1644().MTH1162(s3))));
                        }
                    }
                    hashSet0.addAll(arrayList1);
                }
                if(this.MTH1643().MTH938("chatroom_container_all_enable", true)) {
                    String s4 = CLS27.MTH904();
                    ʻ0.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        Cursor cursor0 = ʻ0.MTH5307(CLS27.MTH882("q_db30"), null);
                        if(cursor0 != null) {
                            if(cursor0.moveToFirst()) {
                                while(true) {
                                    String s5 = cursor0.getString(cursor0.getColumnIndex("chatroomname"));
                                    if(!CLS502.MTH6934("", new String[]{s5}) && CLS502.MTH6934(cursor0.getString(cursor0.getColumnIndex("memberlist")), new String[]{s4})) {
                                        arrayList2.add(s5);
                                    }
                                    if(!cursor0.moveToNext()) {
                                        break;
                                    }
                                }
                            }
                            cursor0.close();
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                    hashSet0.addAll(arrayList2);
                }
                else {
                    String s6 = this.MTH1643().MTH925("chatroom_container_list", "");
                    if(!TextUtils.isEmpty(s6)) {
                        Collections.addAll(hashSet0, CLS502.MTH6941(s6));
                    }
                }
                Iterator iterator1 = hashSet0.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        break alab1;
                    }
                    Object object1 = iterator1.next();
                    if(hashSet2.contains(object1)) {
                        iterator1.remove();
                    }
                }
            }
            case 1: {
                hashSet0.addAll(ʻ0.MTH5322(CLS27.MTH904()));
                break;
            }
            case 2: {
                hashSet0.addAll(ʻ0.MTH5336(CLS27.MTH904()));
                break;
            }
            case 3: {
                hashSet0.addAll(this.MTH1636());
                break;
            }
            case 4: {
                hashSet0.addAll(ʻ0.MTH5351(CLS27.MTH904()));
                break;
            }
            default: {
                String s2 = s1.startsWith("_c_") ? this.MTH1643().MTH925(s, "") : this.MTH1644().MTH1162(s1);
                if(!TextUtils.isEmpty(s2)) {
                    Collections.addAll(hashSet0, CLS502.MTH6941(s2));
                }
            }
        }
        try {
            if(this.FLD287 == null) {
                this.FLD287 = (CLS56)CLS40.FLD157.MTH1118(CLS56.class);
            }
            CLS56 ᵔʾ0 = this.FLD287;
            if(ᵔʾ0 != null) {
                for(Object object2: ᵔʾ0.MTH1262()) {
                    hashSet0.remove(((String)object2));
                }
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
        this.MTH1656(hashSet0);
        hashMap0.put(s, hashSet0);
        return hashSet0;
    }

    public final void MTH1623(String s, AbstractCollection abstractCollection0) {
        this.MTH1641(s, abstractCollection0);
        this.FLD300.remove(s);
        this.MTH1627();
        this.MTH1653(s);
        this.MTH1633();
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public final String MTH1624() {
        CLS29 ˎᵢ0 = this.MTH1643();
        return ˎᵢ0 == null ? "" : ˎᵢ0.MTH925("wx_chatroom_containers", "");
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public final String MTH1625(String s) {
        CLS29 ˎᵢ0 = this.MTH1643();
        String s1 = ˎᵢ0 == null ? "" : ˎᵢ0.MTH925(CLS182.MTH3484(0x38EB9C4B2B3CD335L, new StringBuilder(), s), "");
        if(!TextUtils.isEmpty(s1)) {
            return s1;
        }
        String s2 = s.substring(3);
        switch(s2) {
            case "_GH_": {
                return CLS27.MTH889("public_accounts");
            }
            case "_MAIN_": {
                return CLS27.MTH889("chatroom_container");
            }
            case "_MUTE_": {
                return CLS27.MTH889("mute_chatrooms");
            }
            case "_OWN_": {
                return CLS27.MTH889("own_chatrooms");
            }
            case "_WORK_": {
                return CLS27.MTH889("wework_chatrooms");
            }
            default: {
                return s2;
            }
        }
    }

    public final void MTH1626() {
        if(this.FLD299) {
            return;
        }
        this.FLD299 = true;
    }

    // 此方法包含解密的字符串
    public final void MTH1627() {
        String s;
        if(this.MTH1643().MTH938("chatcontainer_enable", false)) {
            String s1 = this.MTH1624();
            HashSet hashSet0 = this.FLD279;
            hashSet0.clear();
            CLS29 ˎᵢ0 = this.MTH1643();
            String[] arr_s = CLS502.MTH6941(s1);
            for(int v = 0; v < arr_s.length; ++v) {
                String s2 = arr_s[v];
                if(s2.startsWith("wx__c_")) {
                    hashSet0.addAll(Arrays.asList(CLS502.MTH6941(ˎᵢ0.MTH925(s2, ""))));
                }
            }
            s = " and rconversation.username not in (\'" + TextUtils.join("\',\'", hashSet0) + "\')";
        }
        else {
            s = "";
        }
        this.FLD295 = s;
    }

    // 此方法包含解密的字符串
    public final void MTH1628(String s, String s1) {
        CLS29 ˎᵢ0 = this.MTH1643();
        if(ˎᵢ0 == null) {
            return;
        }
        ˎᵢ0.MTH922(s1, "wxcc_" + s);
    }

    // 此方法包含解密的字符串
    public final void MTH1629(JSONArray jSONArray0) {
        HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(this.FLD288.MTH925("custom_avatar_list", ""))));
        for(int v = 0; v < jSONArray0.length(); ++v) {
            try {
                JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                String s = jSONObject0.getString("c");
                String s1 = jSONObject0.getString("n");
                HashSet hashSet1 = new HashSet(Arrays.asList(CLS502.MTH6941(jSONObject0.getString("d"))));
                if(jSONObject0.optBoolean("a")) {
                    hashSet0.add(s);
                }
                this.MTH1645("wx_chatroom_containers", s);
                this.MTH1628(s, s1);
                if(!this.FLD280.MTH5358(s)) {
                    CLS404.MTH5898(s, System.currentTimeMillis(), true);
                    CLS66.MTH1447(s);
                    this.MTH1633();
                }
                this.MTH1623(s, hashSet1);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        this.FLD288.MTH922(TextUtils.join(",", hashSet0), "custom_avatar_list");
    }

    // 此方法包含解密的字符串
    public final void MTH1630(Activity activity0, String s) {
        if(!this.MTH1643().MTH938("chatroom_container", false) && !this.MTH1643().MTH938("chatcontainer_enable", false) || !CLS404.MTH5909(s)) {
            return;
        }
        Intent intent0 = new Intent();
        intent0.putExtra("Contact_User", s);
        if(!CLS66.MTH1502(intent0, ".ui.conversation.ConvBoxServiceConversationUI")) {
            intent0.setClassName(CLS390.MTH5619(activity0), CLS27.MTH897("ConvBoxServiceConversationUI"));
            activity0.startActivity(intent0);
        }
    }

    // 此方法包含解密的字符串
    public final String MTH1631(String s) {
        String s1 = "wx__c_" + Long.toHexString(System.currentTimeMillis());
        this.MTH1645("wx_chatroom_containers", s1);
        this.MTH1628(s1, s);
        if(!this.FLD280.MTH5358(s1)) {
            CLS404.MTH5898(s1, System.currentTimeMillis(), true);
            CLS66.MTH1447(s1);
            this.MTH1633();
        }
        this.MTH1633();
        return s1;
    }

    // 此方法包含解密的字符串
    public static void MTH1632(Activity activity0, String s) {
        CLS21.FLD76.MTH819("switching_contact_view", new Object[0]);
        Intent intent0 = new Intent();
        if(s.equals("floatbottle") && !CLS182.MTH3470(4101502225748906805L)) {
            intent0.setClassName(CLS390.MTH5619(activity0), CLS27.MTH897("BottleConversationUI"));
            if(!CLS66.MTH1502(intent0, CLS27.MTH897("BottleConversationUI"))) {
                intent0.setClassName(CLS390.MTH5619(activity0), CLS27.MTH897(CLS370.MTH5289(4101503046087660341L)));
                activity0.startActivity(intent0);
            }
        }
        else if(!s.equals("officialaccounts") || !CLS27.MTH890("BizConversationUI") && !CLS27.MTH890("NewBizConversationUI")) {
            intent0.putExtra("Chat_Mode", 1);
            intent0.putExtra("Chat_User", s);
            if(!CLS66.MTH1502(intent0, ".ui.chatting.ChattingUI")) {
                intent0.setClassName(CLS390.MTH5619(activity0), CLS27.MTH897(CLS370.MTH5289(4101499837747090229L)));
                activity0.startActivity(intent0);
            }
        }
        else if(CLS27.MTH890("BizConversationUI")) {
            intent0.setClassName(CLS390.MTH5619(activity0), CLS27.MTH897("BizConversationUI"));
            if(!CLS66.MTH1502(intent0, CLS27.MTH897("BizConversationUI"))) {
                intent0.setClassName(CLS390.MTH5619(activity0), CLS27.MTH897(CLS370.MTH5289(4101503608728376117L)));
                activity0.startActivity(intent0);
            }
        }
        else if(CLS27.MTH890("NewBizConversationUI")) {
            intent0.setClassName(CLS390.MTH5619(activity0), CLS27.MTH897("NewBizConversationUI"));
            if(!CLS66.MTH1502(intent0, CLS27.MTH897("NewBizConversationUI"))) {
                intent0.setClassName(CLS390.MTH5619(activity0), CLS27.MTH897(CLS370.MTH5289(4101503406864913205L)));
                activity0.startActivity(intent0);
            }
        }
    }

    public final void MTH1633() {
        if(CLS79.MTH1649()) {
            Object object0 = CLS79.MTH1621();
            if(object0 != null) {
                CLS1255 ᵢﹶ0 = new CLS1255(this, object0, 14);
                CLS40.FLD157.MTH1116(((CLS39)ᵢﹶ0));
            }
        }
        else {
            CLS583 ـﹳ0 = new CLS583(this, 0);
            CLS40.FLD157.MTH1117(((CLS39)ـﹳ0), 3000L);
        }
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH1634(String s) {
        int v;
        String s1 = s.substring(3);
        ArrayList arrayList0 = new ArrayList();
        switch(s1) {
            case "_GH_": {
                v = 4;
                break;
            }
            case "_MAIN_": {
                v = 0;
                break;
            }
            case "_MUTE_": {
                v = 2;
                break;
            }
            case "_OWN_": {
                v = 1;
                break;
            }
            case "_WORK_": {
                v = 3;
                break;
            }
            default: {
                v = -1;
            }
        }
        CLS371 ʻ0 = this.FLD280;
        switch(v) {
            case 0: {
                if(this.MTH1643().MTH938("chatroom_container_all_enable", true)) {
                    ʻ0.MTH5294(CLS27.MTH904(), arrayList0);
                }
                else {
                    String s4 = this.MTH1643().MTH925("chatroom_container_list", "");
                    if(!TextUtils.isEmpty(s4)) {
                        String[] arr_s1 = CLS502.MTH6941(s4);
                        for(int v2 = 0; v2 < arr_s1.length; ++v2) {
                            String s5 = arr_s1[v2];
                            arrayList0.add(new CLS78(s5, ʻ0.MTH5311(s5)));
                        }
                    }
                }
                HashSet hashSet0 = new HashSet();
                String s6 = CLS27.MTH904();
                if(this.MTH1643().MTH938("chatroom_container_work_enable", false)) {
                    hashSet0.addAll(ʻ0.MTH5351(s6));
                }
                if(this.MTH1643().MTH938("chatroom_container_mute_enable", false)) {
                    hashSet0.addAll(ʻ0.MTH5336(s6));
                }
                if(this.MTH1643().MTH938("chatroom_container_own_enable", false)) {
                    hashSet0.addAll(ʻ0.MTH5322(s6));
                }
                if(this.MTH1643().MTH938("chatroom_container_tag_enable", false) && this.MTH1648().MTH6895("chatroom_container_tags")) {
                    HashSet hashSet1 = new HashSet(this.MTH1644().MTH1165());
                    for(Object object2: new HashSet(Arrays.asList(this.MTH1643().MTH925("chatroom_container_tags", "").split(",")))) {
                        String s7 = (String)object2;
                        if(hashSet1.contains(s7)) {
                            hashSet0.addAll(Arrays.asList(CLS502.MTH6941(this.FLD297.MTH1162(s7))));
                        }
                    }
                }
                if(!hashSet0.isEmpty()) {
                    Iterator iterator3 = arrayList0.iterator();
                    while(true) {
                        if(!iterator3.hasNext()) {
                            break;
                        }
                        iterator3.next();
                        if(hashSet0.contains("")) {
                            iterator3.remove();
                        }
                    }
                }
                break;
            }
            case 1: {
                ʻ0.MTH5292(CLS27.MTH904(), arrayList0);
                break;
            }
            case 2: {
                ʻ0.MTH5339(CLS27.MTH904(), arrayList0);
                break;
            }
            case 3: {
                ʻ0.MTH5357(CLS27.MTH904(), arrayList0);
                break;
            }
            case 4: {
                for(Object object1: this.MTH1636()) {
                    arrayList0.add(new CLS78(((String)object1), ʻ0.MTH5311(((String)object1))));
                }
                break;
            }
            default: {
                if(s1.startsWith("_c_")) {
                    for(Object object0: this.MTH1655(s)) {
                        arrayList0.add(new CLS78(((String)object0), ʻ0.MTH5316(((String)object0))));
                    }
                }
                else {
                    String s2 = this.MTH1644().MTH1162(s1);
                    if(!TextUtils.isEmpty(s2)) {
                        String[] arr_s = CLS502.MTH6941(s2);
                        for(int v1 = 0; v1 < arr_s.length; ++v1) {
                            String s3 = arr_s[v1];
                            arrayList0.add(new CLS78(s3, ʻ0.MTH5316(s3)));
                        }
                    }
                }
            }
        }
        if(!arrayList0.isEmpty()) {
            boolean z = this.MTH1639();
            Iterator iterator4 = arrayList0.iterator();
            while(iterator4.hasNext()) {
                Object object3 = iterator4.next();
                if(((CLS78)object3) == null || CLS426.MTH6126("") && !CLS371.FLD3470.MTH5383("") || (!CLS371.FLD3470.MTH5382("") || z && (CLS371.FLD3470.MTH5379("") || !this.MTH1643().MTH938("container_show_empty", false) && !CLS371.FLD3470.MTH5358(""))) || CLS21.FLD76.MTH830("isHidden", new Object[]{""})) {
                    iterator4.remove();
                }
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final void MTH1635(ArrayList arrayList0, AbstractCollection abstractCollection0, String s) {
        CLS371 ʻ0;
        if(abstractCollection0 != null && !abstractCollection0.isEmpty()) {
            Class class0 = CLS27.MTH894("ConversationItemClass");
            if(class0 == null) {
                return;
            }
            try {
                ArrayList arrayList1 = new ArrayList(abstractCollection0);
                HashSet hashSet0 = new HashSet();
                int v = arrayList1.size();
                long v1 = 0L;
                Object object0 = null;
                int v3 = 0;
                int v4 = 0;
                for(int v2 = 0; true; v2 += 500) {
                    ʻ0 = this.FLD280;
                    if(v2 >= v) {
                        break;
                    }
                    Cursor cursor0 = ʻ0.MTH5320(arrayList1.subList(v2, Math.min(v, v2 + 500)));
                    if(cursor0 != null) {
                        if(cursor0.moveToFirst()) {
                            while(true) {
                                Object object1 = CLS166.MTH3188(class0, new Object[0]);
                                CLS166.MTH3195(object1, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
                                hashSet0.add(((String)CLS166.MTH3194(object1, "field_username")));
                                long v5 = CLS166.MTH3185(object1, "field_conversationTime");
                                if(v5 > v1) {
                                    object0 = object1;
                                    v1 = v5;
                                }
                                int v6 = CLS166.MTH3181(object1, "field_unReadCount");
                                v4 += v6;
                                if(v6 > 0) {
                                    ++v3;
                                }
                                if(!cursor0.moveToNext()) {
                                    break;
                                }
                            }
                        }
                        if(!cursor0.isClosed()) {
                            cursor0.close();
                        }
                    }
                }
                if(hashSet0.size() == arrayList1.size()) {
                label_58:
                    if(object0 != null) {
                        CLS166.MTH3196(v3, object0, "field_unReadCount");
                        CLS166.MTH3196(v4, object0, "field_unReadMuteCount");
                    }
                }
                else {
                    Iterator iterator0 = arrayList1.iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            goto label_58;
                        }
                        Object object2 = iterator0.next();
                        String s1 = (String)object2;
                        if(!hashSet0.contains(s1)) {
                            Cursor cursor1 = ʻ0.MTH5300(s1);
                            if(cursor1 != null) {
                                if(cursor1.moveToFirst()) {
                                    while(true) {
                                        Object object3 = CLS166.MTH3188(class0, new Object[0]);
                                        String s2 = cursor1.getString(cursor1.getColumnIndex("talker"));
                                        CLS166.MTH3190(cursor1.getLong(cursor1.getColumnIndex("createTime")), object3, "field_conversationTime");
                                        CLS166.MTH3198(object3, "field_username", s2);
                                        CLS166.MTH3198(object3, "field_msgType", cursor1.getString(cursor1.getColumnIndex("type")));
                                        CLS166.MTH3198(object3, "field_content", cursor1.getString(cursor1.getColumnIndex("content")));
                                        CLS166.MTH3198(object3, "field_digestUser", s2);
                                        hashSet0.add(((String)CLS166.MTH3194(object3, "field_username")));
                                        long v7 = CLS166.MTH3185(object3, "field_conversationTime");
                                        if(v7 > v1) {
                                            v1 = v7;
                                            object0 = object3;
                                        }
                                        if(!cursor1.moveToNext()) {
                                            break;
                                        }
                                    }
                                }
                                if(!cursor1.isClosed()) {
                                    cursor1.close();
                                }
                            }
                        }
                    }
                }
                arrayList0.add(Pair.create(s, object0));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public final HashSet MTH1636() {
        if(this.FLD284 == null || this.FLD284.isEmpty()) {
            this.FLD284 = this.FLD280.MTH5363();
            String s = this.MTH1643().MTH925("include_public_accounts_list", "");
            if(!TextUtils.isEmpty(s)) {
                this.FLD284.addAll(Arrays.asList(CLS502.MTH6941(s)));
            }
            String s1 = this.MTH1643().MTH925("exclude_public_accounts_list", "");
            if(!TextUtils.isEmpty(s1)) {
                Iterator iterator0 = this.FLD284.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    if(CLS502.MTH6934(s1, new String[]{((String)object0)})) {
                        iterator0.remove();
                    }
                }
            }
        }
        return this.FLD284;
    }

    public final String MTH1637(String s) {
        HashMap hashMap0 = this.FLD285;
        if(hashMap0.containsKey(s)) {
            return (String)hashMap0.get(s);
        }
        if(this.MTH1643() == null) {
            return null;
        }
        String[] arr_s = CLS502.MTH6941(this.MTH1624());
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            String s2 = this.MTH1625(s1);
            if(s2.equals(s)) {
                hashMap0.put(s2, s1);
                return s1;
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final void MTH1638(String s) {
        this.MTH1645("wx_chatroom_containers", s);
        boolean z = this.MTH1643().MTH938("chatroom_container", false);
        boolean z1 = this.MTH1643().MTH938("chatcontainer_enable", false);
        boolean z2 = s.startsWith("wx__c_");
        if((z1 && z2 || !z2 && z) && !this.FLD280.MTH5358(s)) {
            CLS404.MTH5898(s, System.currentTimeMillis(), true);
            CLS66.MTH1447(s);
            this.MTH1633();
        }
        if(z2) {
            return;
        }
        this.FLD300.remove("wx__MAIN_");
        this.MTH1653("wx__MAIN_");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public final boolean MTH1639() {
        return CLS27.MTH890("ConvBoxServiceConversationUI") && !this.MTH1643().MTH938("chatcontainer_dialog_mode", false);
    }

    // 此方法包含解密的字符串
    public final void MTH1640(Activity activity0, String s) {
        if(!this.MTH1643().MTH938("chatroom_container", false) && !this.MTH1643().MTH938("chatcontainer_enable", false) || !CLS404.MTH5909(s)) {
            return;
        }
        HashSet hashSet0 = this.FLD282;
        if(hashSet0.contains(s)) {
            try {
                hashSet0.remove(s);
                HashMap hashMap0 = this.FLD294;
                if(hashMap0.containsKey(s)) {
                    CLS425 ˊﹳ0 = (CLS425)hashMap0.get(s);
                    if(ˊﹳ0 != null) {
                        ˊﹳ0.MTH6095();
                    }
                    hashMap0.remove(s);
                    this.FLD281.remove(ˊﹳ0);
                    this.FLD290.removeFirstOccurrence(ˊﹳ0);
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        CLS29 ˎᵢ0 = this.MTH1643();
        if(ˎᵢ0 == null) {
            return;
        }
        CLS612 ᵔʾ0 = new CLS612(this, ˎᵢ0, s, activity0, 5);
        CLS40.FLD157.MTH1124(((CLS39)ᵔʾ0));
    }

    // 此方法包含解密的字符串
    public final void MTH1641(String s, AbstractCollection abstractCollection0) {
        if(abstractCollection0 != null && !abstractCollection0.isEmpty()) {
            CLS29 ˎᵢ0 = this.MTH1643();
            if(ˎᵢ0 == null) {
                return;
            }
            HashSet hashSet0 = this.MTH1655(s);
            Iterator iterator0 = abstractCollection0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(hashSet0.contains(((String)object0))) {
                    iterator0.remove();
                }
            }
            if(abstractCollection0.isEmpty()) {
                return;
            }
            hashSet0.addAll(abstractCollection0);
            ˎᵢ0.MTH922(TextUtils.join(",", hashSet0), s);
        }
    }

    // 此方法包含解密的字符串
    public final CharSequence MTH1642(Object object0) {
        Object object1 = CLS79.MTH1621();
        if(object1 != null && object0 != null) {
            try {
                boolean z = TextUtils.isEmpty(CLS27.MTH897("ConversationAdapterGetDigestMethod"));
                Object object2 = null;
                int v = this.FLD301;
                if(!z) {
                    Object object3 = CLS166.MTH3194(object1, CLS27.MTH897("ConversationAdapterField3"));
                    return (CharSequence)CLS166.MTH3195(object1, CLS27.MTH897("ConversationAdapterGetDigestMethod"), new Object[]{object0, v, object3, Boolean.TRUE});
                }
                if(TextUtils.isEmpty(CLS27.MTH897("ConversationAdapterGetDigestMethod_d"))) {
                    if(!TextUtils.isEmpty(CLS27.MTH897("ConversationAdapterGetDigestMethod_e"))) {
                        Object object6 = CLS166.MTH3188(CLS27.MTH894("ConversationAdapterClass2"), new Object[0]);
                        CLS166.MTH3196(0, object6, CLS27.MTH897("ConversationAdapterClass2_field1"));
                        return (CharSequence)CLS166.MTH3195(object1, CLS27.MTH897("ConversationAdapterGetDigestMethod_e"), new Object[]{object0, v, Boolean.TRUE, object6});
                    }
                    if(!TextUtils.isEmpty(CLS27.MTH897("ConversationAdapterGetDigestMethod_c"))) {
                        Object object7 = CLS166.MTH3188(CLS27.MTH894("ConversationAdapterClass2"), new Object[0]);
                        CLS166.MTH3196(0, object7, CLS27.MTH897("ConversationAdapterClass2_field1"));
                        if(!TextUtils.isEmpty(CLS27.MTH897("ConversationAdapterMethod3"))) {
                            object2 = CLS166.MTH3195(object1, CLS27.MTH897("ConversationAdapterMethod3"), new Object[]{object0});
                        }
                        else if(!TextUtils.isEmpty(CLS27.MTH897("ConversationAdapterField1"))) {
                            String s1 = (String)CLS166.MTH3194(object0, "field_username");
                            HashMap hashMap1 = (HashMap)CLS166.MTH3194(object1, CLS27.MTH897("ConversationAdapterField1"));
                            if(hashMap1 != null && hashMap1.containsKey(s1)) {
                                object2 = hashMap1.get(s1);
                            }
                        }
                        if(object2 != null) {
                            if(CLS27.MTH890("ConversationAdapterField4") && CLS166.MTH3181(object2, CLS27.MTH897("ConversationAdapterField4")) == 1) {
                                CLS166.MTH3196(101, object7, CLS27.MTH897("ConversationAdapterClass2_field1"));
                            }
                            CharSequence charSequence2 = (CharSequence)CLS166.MTH3194(object2, CLS27.MTH897("ConversationAdapterClass2_field2"));
                            if(charSequence2 == null) {
                                CharSequence charSequence3 = (CharSequence)CLS166.MTH3195(object1, CLS27.MTH897("ConversationAdapterGetDigestMethod_c"), new Object[]{object0, v, Boolean.TRUE, object7});
                                CLS166.MTH3198(object2, CLS27.MTH897("ConversationAdapterClass2_field2"), charSequence3);
                                return charSequence3;
                            }
                            return charSequence2;
                        }
                        if(!TextUtils.isEmpty(CLS27.MTH897("ConversationAdapterClass_field4"))) {
                            Object object8 = CLS166.MTH3194(object1, CLS27.MTH897("ConversationAdapterClass_field4"));
                            return object8 == null ? ((CharSequence)CLS166.MTH3195(object1, CLS27.MTH897("ConversationAdapterGetDigestMethod_c"), new Object[]{object0, v, Boolean.TRUE, object7})) : ((CharSequence)CLS166.MTH3195(object1, CLS27.MTH897("ConversationAdapterGetDigestMethod_c"), new Object[]{object0, v, object8, Boolean.TRUE, object7}));
                        }
                        return (CharSequence)CLS166.MTH3195(object1, CLS27.MTH897("ConversationAdapterGetDigestMethod_c"), new Object[]{object0, v, Boolean.TRUE, object7});
                    }
                    if(!TextUtils.isEmpty(CLS27.MTH897("ConversationAdapterGetDigestMethod_b"))) {
                        Object object9 = CLS166.MTH3194(object1, CLS27.MTH897("ConversationAdapterField3"));
                        Object object10 = CLS166.MTH3188(CLS27.MTH894("ConversationAdapterClass2"), new Object[0]);
                        CLS166.MTH3196(0, object10, CLS27.MTH897("ConversationAdapterClass2_field1"));
                        Object object11 = CLS166.MTH3195(object1, CLS27.MTH897("ConversationAdapterMethod3"), new Object[]{object0});
                        if(CLS27.MTH890("ConversationAdapterField4") && CLS166.MTH3181(object11, CLS27.MTH897("ConversationAdapterField4")) == 1) {
                            CLS166.MTH3196(101, object10, CLS27.MTH897("ConversationAdapterClass2_field1"));
                        }
                        CharSequence charSequence4 = (CharSequence)CLS166.MTH3194(object11, CLS27.MTH897("ConversationAdapterClass2_field2"));
                        if(charSequence4 == null) {
                            CharSequence charSequence5 = (CharSequence)CLS166.MTH3195(object1, CLS27.MTH897("ConversationAdapterGetDigestMethod_b"), new Object[]{object0, v, object9, Boolean.TRUE, object10});
                            CLS166.MTH3198(object11, CLS27.MTH897("ConversationAdapterClass2_field2"), charSequence5);
                            return charSequence5;
                        }
                        return charSequence4;
                    }
                    if(this.FLD283 == null) {
                        this.FLD283 = CLS164.MTH3174(object1, null, CharSequence.class, new Object[]{null, Integer.TYPE, Boolean.TYPE});
                    }
                    Method method0 = this.FLD283;
                    if(method0 != null) {
                        return (CharSequence)CLS164.MTH3178(object1, method0, new Object[]{object0, v, Boolean.TRUE});
                    }
                }
                else {
                    Object object4 = CLS166.MTH3188(CLS27.MTH894("ConversationAdapterClass2"), new Object[0]);
                    CLS166.MTH3196(0, object4, CLS27.MTH897("ConversationAdapterClass2_field1"));
                    if(!TextUtils.isEmpty(CLS27.MTH897("ConversationAdapterMethod3"))) {
                        object2 = CLS166.MTH3195(object1, CLS27.MTH897("ConversationAdapterMethod3"), new Object[]{object0});
                    }
                    else if(!TextUtils.isEmpty(CLS27.MTH897("ConversationAdapterField1"))) {
                        String s = (String)CLS166.MTH3194(object0, "field_username");
                        HashMap hashMap0 = (HashMap)CLS166.MTH3194(object1, CLS27.MTH897("ConversationAdapterField1"));
                        if(hashMap0 != null && hashMap0.containsKey(s)) {
                            object2 = hashMap0.get(s);
                        }
                    }
                    if(object2 != null) {
                        if(CLS27.MTH890("ConversationAdapterField4") && CLS166.MTH3181(object2, CLS27.MTH897("ConversationAdapterField4")) == 1) {
                            CLS166.MTH3196(101, object4, CLS27.MTH897("ConversationAdapterClass2_field1"));
                        }
                        CharSequence charSequence0 = (CharSequence)CLS166.MTH3194(object2, CLS27.MTH897("ConversationAdapterClass2_field2"));
                        if(charSequence0 == null) {
                            CharSequence charSequence1 = (CharSequence)CLS166.MTH3195(object1, CLS27.MTH897("ConversationAdapterGetDigestMethod_d"), new Object[]{object0, object2, v, Boolean.TRUE, object4});
                            CLS166.MTH3198(object2, CLS27.MTH897("ConversationAdapterClass2_field2"), charSequence1);
                            return charSequence1;
                        }
                        return charSequence0;
                    }
                    if(!CLS27.MTH890("ConversationAdapterClass_field4")) {
                        return (CharSequence)CLS166.MTH3195(object1, CLS27.MTH897("ConversationAdapterGetDigestMethod_d"), new Object[]{object0, null, v, Boolean.TRUE, object4});
                    }
                    Object object5 = CLS166.MTH3194(object1, CLS27.MTH897("ConversationAdapterClass_field4"));
                    if(object5 != null) {
                        return (CharSequence)CLS166.MTH3195(object1, CLS27.MTH897("ConversationAdapterGetDigestMethod_d"), new Object[]{object0, null, v, object5, Boolean.TRUE, object4});
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return "";
        }
        return "";
    }

    public final CLS29 MTH1643() {
        if(this.FLD288 == null) {
            this.FLD288 = (CLS29)CLS40.FLD157.MTH1118(CLS29.class);
        }
        return this.FLD288;
    }

    public final CLS43 MTH1644() {
        if(this.FLD297 == null) {
            this.FLD297 = (CLS43)CLS40.FLD157.MTH1118(CLS43.class);
        }
        return this.FLD297;
    }

    public final void MTH1645(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s1);
        this.MTH1641(s, arrayList0);
    }

    public final void MTH1646(String s, ArrayList arrayList0) {
        this.MTH1618(s, arrayList0);
        this.FLD300.remove(s);
        this.MTH1627();
        this.MTH1653(s);
        this.MTH1633();
    }

    // 此方法包含解密的字符串
    public final void MTH1647(String s, ContentValues contentValues0, String[] arr_s) {
        if(!"rconversation".equalsIgnoreCase(s)) {
            return;
        }
        String s1 = contentValues0.containsKey("username") ? contentValues0.getAsString("username") : "";
        if(contentValues0.containsKey("unReadCount") && TextUtils.isEmpty(s1) && arr_s != null) {
            s1 = arr_s[0];
        }
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        boolean z = this.MTH1643().MTH938("chatroom_container", false);
        boolean z1 = this.MTH1643().MTH938("chatcontainer_enable", false);
        if(!z1 && !z) {
            return;
        }
        if(!z1) {
            if(!CLS426.MTH6126(s1) && (!this.MTH1643().MTH938("chatroom_container_public_enable", false) || !CLS372.MTH5400(s1))) {
                return;
            }
            String s2 = this.MTH1624();
            if(TextUtils.isEmpty(s2) || CLS502.MTH6934(s2, new String[]{s1}) || !this.MTH1643().MTH938("chatroom_container_all_enable", true) && !this.FLD296.contains(s1)) {
                return;
            }
        }
        this.MTH1654(s1);
        CLS1259 ⁱᵔ0 = new CLS1259(this, s1, ((long)(contentValues0.containsKey("conversationTime") ? CLS34.MTH1080(0x38EB9DA52B3CD335L, contentValues0) : 0L)), 5);
        CLS40.FLD157.MTH1124(((CLS39)ⁱᵔ0));
    }

    public final CLS500 MTH1648() {
        if(this.FLD289 == null) {
            this.FLD289 = CLS500.FLD4928;
        }
        return this.FLD289;
    }

    public static boolean MTH1649() {
        Object object0 = CLS79.MTH1621();
        return object0 == null ? false : CLS182.MTH3470(4101497862062134069L) || CLS182.MTH3492(0x38EB72AD2B3CD335L, object0) != null;
    }

    public final JSONObject MTH1650(String s) {
        CLS29 ˎᵢ0 = this.MTH1643();
        return ˎᵢ0 == null ? new JSONObject() : ˎᵢ0.MTH924(CLS182.MTH3484(4101501525669237557L, new StringBuilder(), s), new JSONObject());
    }

    // 此方法包含解密的字符串
    public final void MTH1651(String s, JSONObject jSONObject0) {
        CLS29 ˎᵢ0 = this.MTH1643();
        if(ˎᵢ0 == null) {
            return;
        }
        ˎᵢ0.MTH922(jSONObject0, "wxcc_stat_" + s);
    }

    // 此方法包含解密的字符串
    public final Object MTH1652(String s) {
        Object object0;
        Class class0 = CLS27.MTH894("ConversationItemClass");
        if(class0 != null && !TextUtils.isEmpty(s)) {
            try {
                this.FLD280.getClass();
                String s1 = TextUtils.isEmpty(s) || CLS404.MTH5909(s) ? "select * from rconversation where username = \'\'" : "select * from rconversation where username = \'" + s + "\'";
                Cursor cursor0 = this.FLD280.MTH5307(s1, null);
                if(cursor0 == null) {
                    return null;
                }
                if(cursor0.moveToFirst()) {
                    do {
                        object0 = CLS166.MTH3188(class0, new Object[0]);
                        CLS166.MTH3195(object0, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
                    }
                    while(cursor0.moveToNext());
                }
                else {
                    object0 = null;
                }
                if(!cursor0.isClosed()) {
                    cursor0.close();
                }
                return object0;
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final void MTH1653(String s) {
        try {
            CLS371 ʻ0 = this.FLD280;
            JSONObject jSONObject0 = this.MTH1650(s);
            HashSet hashSet0 = this.MTH1622(s);
            Iterator iterator0 = hashSet0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(CLS372.MTH5396(((String)object0))) {
                    iterator0.remove();
                }
            }
            int v = ʻ0.MTH5329(hashSet0);
            int v1 = ʻ0.MTH5325(hashSet0);
            if(!jSONObject0.has("unread") || !jSONObject0.has("unreadCount") || jSONObject0.getInt("unread") != v || jSONObject0.getInt("unreadCount") != v1) {
                jSONObject0.put("unread", v);
                jSONObject0.put("unreadCount", v1);
                this.MTH1651(s, jSONObject0);
            }
            if(!this.MTH1658(s)) {
                return;
            }
            this.MTH1615(s, jSONObject0, hashSet0);
            CLS404.MTH5898(s, ((long)(jSONObject0.has("conversationTime") ? jSONObject0.getLong("conversationTime") : System.currentTimeMillis())), CLS66.MTH1364(s));
            CLS66.MTH1447(s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1654(String s) {
        HashMap hashMap0 = this.FLD294;
        if(!hashMap0.isEmpty() && (this.MTH1643().MTH938("chatroom_container", false) || this.MTH1643().MTH938("chatcontainer_enable", false))) {
            try {
                String s1 = (String)this.FLD290.peekLast();
                if(TextUtils.isEmpty(s1)) {
                    return;
                }
                CLS425 ˊﹳ0 = (CLS425)hashMap0.get(s1);
                if(ˊﹳ0 != null && ˊﹳ0.isShowing() && ˊﹳ0.getWindow().getDecorView().getVisibility() != 8) {
                    ˊﹳ0.FLD4108 = true;
                    ˊﹳ0.FLD4097 = s;
                    if(!ˊﹳ0.FLD4093 && !ˊﹳ0.FLD4101 && !ˊﹳ0.FLD4105) {
                        CLS323 ˈˈ0 = ˊﹳ0.FLD4096;
                        boolean z = ˈˈ0.FLD3297.containsKey(s);
                        boolean z1 = ˈˈ0.FLD3301.isEmpty();
                        if(!z1 || z) {
                            CLS1265 ʻˑ0 = new CLS1265(ˈˈ0, z, z1, s);
                            CLS40.FLD157.MTH1124(((CLS39)ʻˑ0));
                        }
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public final HashSet MTH1655(String s) {
        CLS29 ˎᵢ0 = this.MTH1643();
        if(ˎᵢ0 == null) {
            return new HashSet();
        }
        String s1 = ˎᵢ0.MTH925(s, "");
        HashSet hashSet0 = TextUtils.isEmpty(s1) ? new HashSet() : new HashSet(Arrays.asList(CLS502.MTH6941(s1)));
        if(!s.equals("wx_chatroom_containers")) {
            boolean z = false;
            Iterator iterator0 = hashSet0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s2 = (String)object0;
                if(CLS426.MTH6126(s2)) {
                    String s3 = CLS27.MTH904();
                    if(!(CLS426.MTH6126(s2) ? CLS371.FLD3470.MTH5335(s2).contains(s3) : CLS371.FLD3470.MTH5302(s2))) {
                        iterator0.remove();
                        z = true;
                    }
                }
            }
            if(z) {
                this.MTH1643().MTH922(TextUtils.join(",", hashSet0), s);
            }
        }
        return hashSet0;
    }

    // 此方法包含解密的字符串
    public final void MTH1656(AbstractCollection abstractCollection0) {
        if(abstractCollection0.isEmpty()) {
            return;
        }
        boolean z = this.MTH1639();
        Iterator iterator0 = abstractCollection0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            if(s == null || CLS426.MTH6126(s) && !CLS371.FLD3470.MTH5383(s) || (!CLS371.FLD3470.MTH5382(s) || z && (CLS371.FLD3470.MTH5379(s) || !this.MTH1643().MTH938("container_show_empty", false) && !CLS371.FLD3470.MTH5358(s))) || CLS21.FLD76.MTH830("isHidden", new Object[]{s})) {
                iterator0.remove();
            }
        }
    }

    public final void MTH1657(String s) {
        try {
            if(!this.FLD280.MTH5358(s)) {
                return;
            }
            CLS66.MTH1444(s, null);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final boolean MTH1658(String s) {
        return CLS502.MTH6934(this.MTH1624(), new String[]{s});
    }
}

