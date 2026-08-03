package p000;

import android.app.AndroidAppHelper;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import io.github.cherrywechat.application.MainApplication;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import io.github.cherrywechat.network.model.AboutData;
import io.github.cherrywechat.network.model.AdListData;
import io.github.cherrywechat.network.model.AnnouncementItem;
import io.github.cherrywechat.network.model.AnnouncementsWrapper;
import io.github.cherrywechat.network.model.AuthorizedThemeData;
import io.github.cherrywechat.network.model.CustomerData;
import io.github.cherrywechat.network.model.DeveloperGroups;
import io.github.cherrywechat.network.model.FAQCategory;
import io.github.cherrywechat.network.model.FriendLinkData;
import io.github.cherrywechat.network.model.MusicPlaylistResult;
import io.github.cherrywechat.network.model.MusicTrack;
import io.github.cherrywechat.network.model.SavedMusicList;
import io.github.cherrywechat.network.model.ThemeSimpleData;
import io.github.cherrywechat.network.model.ThemeSimpleItem;
import io.github.cherrywechat.network.model.ThemeStoreData;
import io.github.cherrywechat.network.model.UpdateItem;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1302d implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4744a;

    public /* synthetic */ C1302d(int i) {
        this.f4744a = i;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        C2656w4 c2656w4M1910g;
        C2656w4 c2656w4M1910g2;
        switch (this.f4744a) {
            case 0:
                return AboutData._childSerializers$_anonymous_();
            case 1:
                return AboutData._childSerializers$_anonymous_$0();
            case 2:
                return AdListData._childSerializers$_anonymous_();
            case 3:
                return AnnouncementItem._childSerializers$_anonymous_();
            case 4:
                return AnnouncementsWrapper._childSerializers$_anonymous_();
            case 5:
                return AuthorizedThemeData._childSerializers$_anonymous_();
            case 6:
                return CherryViewAPI.register$lambda$117$lambda$116();
            case 7:
                return CherryViewAPI.cleanup$lambda$135();
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return CustomerData._childSerializers$_anonymous_();
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return DeveloperGroups._childSerializers$_anonymous_();
            case 10:
                return DeveloperGroups._childSerializers$_anonymous_$0();
            case 11:
                return FAQCategory._childSerializers$_anonymous_();
            case 12:
                return FriendLinkData._childSerializers$_anonymous_();
            case 13:
                return C0330Hm.f1132b;
            case 14:
                return C0201Em.f608b;
            case 15:
                return AbstractC0115Cm.f275a;
            case 16:
                return C0287Gm.f932b;
            case 17:
                return C2328om.f8173b;
            case 18:
                return MusicPlaylistResult._childSerializers$_anonymous_();
            case 19:
                return MusicTrack._childSerializers$_anonymous_();
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                C0128Cz c0128Cz = C0128Cz.f301j;
                InterfaceC0126Cx[] interfaceC0126CxArr = new InterfaceC0126Cx[0];
                if (AbstractC2564tz.m5059T("kotlin.Unit")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                if (c0128Cz.equals(C0128Cz.f298g)) {
                    throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                C0268G9 c0268g9 = new C0268G9("kotlin.Unit");
                return new C0212Ex("kotlin.Unit", c0128Cz, c0268g9.f860b.size(), AbstractC0650P4.m1316K(interfaceC0126CxArr), c0268g9);
            case 21:
                return SavedMusicList._childSerializers$_anonymous_();
            case 22:
                return ThemeSimpleData._childSerializers$_anonymous_();
            case 23:
                return ThemeSimpleItem._childSerializers$_anonymous_();
            case 24:
                return ThemeStoreData._childSerializers$_anonymous_();
            case 25:
                return UpdateItem._childSerializers$_anonymous_();
            case 26:
                Context contextCurrentApplication = MainApplication.f5549a;
                if (contextCurrentApplication == null && (contextCurrentApplication = C1456gf.f5172p) == null) {
                    contextCurrentApplication = AndroidAppHelper.currentApplication();
                    AbstractC0295Gu.m625r(-836852902787125L);
                }
                return contextCurrentApplication.getSharedPreferences(AbstractC0295Gu.m625r(-463981022017589L), 0);
            default:
                Context contextCurrentApplication2 = MainApplication.f5549a;
                if (contextCurrentApplication2 == null && (contextCurrentApplication2 = C1456gf.f5172p) == null) {
                    contextCurrentApplication2 = AndroidAppHelper.currentApplication();
                    AbstractC0295Gu.m625r(-836852902787125L);
                }
                contextCurrentApplication2.getApplicationContext();
                KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
                if (keyGenParameterSpecBuild == null) {
                    throw new NullPointerException("KeyGenParameterSpec was null after build() check");
                }
                Object obj = AbstractC2727xq.f9314a;
                if (keyGenParameterSpecBuild.getKeySize() != 256) {
                    throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpecBuild.getKeySize() + " bits");
                }
                if (!Arrays.equals(keyGenParameterSpecBuild.getBlockModes(), new String[]{"GCM"})) {
                    throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpecBuild.getBlockModes()));
                }
                if (keyGenParameterSpecBuild.getPurposes() != 3) {
                    throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpecBuild.getPurposes());
                }
                if (!Arrays.equals(keyGenParameterSpecBuild.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                    throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpecBuild.getEncryptionPaddings()));
                }
                if (keyGenParameterSpecBuild.isUserAuthenticationRequired() && keyGenParameterSpecBuild.getUserAuthenticationValidityDurationSeconds() < 1) {
                    throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                }
                synchronized (AbstractC2727xq.f9314a) {
                    String keystoreAlias = keyGenParameterSpecBuild.getKeystoreAlias();
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    if (!keyStore.containsAlias(keystoreAlias)) {
                        try {
                            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                            keyGenerator.init(keyGenParameterSpecBuild);
                            keyGenerator.generateKey();
                        } catch (ProviderException e) {
                            throw new GeneralSecurityException(e.getMessage(), e);
                        }
                    }
                    break;
                }
                String keystoreAlias2 = keyGenParameterSpecBuild.getKeystoreAlias();
                AbstractC0295Gu.m625r(-563611378382901L);
                String str = AbstractC0295Gu.m625r(-563658623023157L) + AbstractC1450gG.f5068b + '_' + AbstractC1450gG.f5067a + '_' + contextCurrentApplication2.getPackageManager().getPackageInfo(contextCurrentApplication2.getPackageName(), 0).lastUpdateTime;
                int i = AbstractC2757yd.f9386a;
                AbstractC0640Ov.m1262h(C0020Ad.f38b);
                if (!AbstractC1489hB.m2848a()) {
                    AbstractC0640Ov.m1260f(new C2567u1(C2302o2.class, new C2481s1[]{new C2481s1(6, InterfaceC2714xd.class)}, 6), true);
                }
                AbstractC1479h1.m2837a();
                Context applicationContext = contextCurrentApplication2.getApplicationContext();
                C0089C2 c0089c2 = new C0089C2();
                c0089c2.f201g = AbstractC1406fG.m2694T("AES256_SIV");
                if (applicationContext == null) {
                    throw new IllegalArgumentException("need an Android context");
                }
                c0089c2.f196b = applicationContext;
                c0089c2.f197c = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
                c0089c2.f198d = str;
                String strM420r = AbstractC0213Ey.m420r("android-keystore://", keystoreAlias2);
                if (!strM420r.startsWith("android-keystore://")) {
                    throw new IllegalArgumentException("key URI must start with android-keystore://");
                }
                c0089c2.f199e = strM420r;
                C0132D2 c0132d2M139a = c0089c2.m139a();
                synchronized (c0132d2M139a) {
                    c2656w4M1910g = ((C1017Xm) c0132d2M139a.f328b).m1910g();
                }
                C0089C2 c0089c22 = new C0089C2();
                c0089c22.f201g = AbstractC1406fG.m2694T("AES256_GCM");
                c0089c22.f196b = applicationContext;
                c0089c22.f197c = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
                c0089c22.f198d = str;
                String strM420r2 = AbstractC0213Ey.m420r("android-keystore://", keystoreAlias2);
                if (!strM420r2.startsWith("android-keystore://")) {
                    throw new IllegalArgumentException("key URI must start with android-keystore://");
                }
                c0089c22.f199e = strM420r2;
                C0132D2 c0132d2M139a2 = c0089c22.m139a();
                synchronized (c0132d2M139a2) {
                    c2656w4M1910g2 = ((C1017Xm) c0132d2M139a2.f328b).m1910g();
                }
                SharedPreferencesC0967Wf sharedPreferencesC0967Wf = new SharedPreferencesC0967Wf(str, applicationContext.getSharedPreferences(str, 0), (InterfaceC1435g1) c2656w4M1910g2.m5214v(InterfaceC1435g1.class), (InterfaceC2714xd) c2656w4M1910g.m5214v(InterfaceC2714xd.class));
                AbstractC0295Gu.m625r(-563744522369077L);
                return sharedPreferencesC0967Wf;
        }
    }

    public /* synthetic */ C1302d(C1426ft c1426ft) {
        this.f4744a = 20;
    }
}
