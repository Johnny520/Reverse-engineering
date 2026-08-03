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

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1302d implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4744a;

    public /* synthetic */ C1302d(int r1) {
        this.f4744a = r1;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f4744a) {
            case 0: goto L151;
            case 1: goto L149;
            case 2: goto L147;
            case 3: goto L145;
            case 4: goto L143;
            case 5: goto L141;
            case 6: goto L139;
            case 7: goto L137;
            case 8: goto L135;
            case 9: goto L133;
            case 10: goto L131;
            case 11: goto L129;
            case 12: goto L127;
            case 13: goto L125;
            case 14: goto L123;
            case 15: goto L121;
            case 16: goto L119;
            case 17: goto L117;
            case 18: goto L115;
            case 19: goto L113;
            case 20: goto L102;
            case 21: goto L101;
            case 22: goto L99;
            case 23: goto L97;
            case 24: goto L95;
            case 25: goto L93;
            case 26: goto L83;
            default: goto L4;
        };
    L4:
        Context r0 = MainApplication.f5549a;
        if (r0 != null) goto L11;
        r0 = C1456gf.f5172p;
        if (r0 != null) goto L11;
        r0 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L11:
        r0.getApplicationContext();
        KeyGenParameterSpec r1 = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build();
        if (r1 == null) goto L82;
        Object r5 = AbstractC2727xq.f9314a;
        if (r1.getKeySize() != 256) goto L80;
        if (Arrays.equals(r1.getBlockModes(), new String[]{"GCM"}) == false) goto L78;
        if (r1.getPurposes() != 3) goto L76;
        if (Arrays.equals(r1.getEncryptionPaddings(), new String[]{"NoPadding"}) == false) goto L74;
        if (r1.isUserAuthenticationRequired() == true) goto L24;
    L28:
        Object r2 = AbstractC2727xq.f9314a;
        monitor-enter(r2);
        String r52 = r1.getKeystoreAlias();     // Catch: Throwable -> L70
        KeyStore r6 = KeyStore.getInstance("AndroidKeyStore");     // Catch: Throwable -> L70
        r6.load(null);     // Catch: Throwable -> L70
        if (r6.containsAlias(r52) == false) goto L155;
    L37:
        monitor-exit(r2);     // Catch: Throwable -> L70
        String r12 = r1.getKeystoreAlias();
        AbstractC0295Gu.m625r(-563611378382901L);
        String r22 = AbstractC0295Gu.m625r(-563658623023157L) + AbstractC1450gG.f5068b + '_' + AbstractC1450gG.f5067a + '_' + r0.getPackageManager().getPackageInfo(r0.getPackageName(), 0).lastUpdateTime;
        int r53 = AbstractC2757yd.f9386a;
        AbstractC0640Ov.m1262h(C0020Ad.f38b);
        if (AbstractC1489hB.m2848a() == true) goto L42;
        AbstractC0640Ov.m1260f(new C2567u1(C2302o2.class, new C2481s1[]{new C2481s1(6, InterfaceC2714xd.class)}, 6), true);
    L42:
        AbstractC1479h1.m2837a();
        Context r02 = r0.getApplicationContext();
        C0089C2 r4 = new C0089C2();
        r4.f201g = AbstractC1406fG.m2694T("AES256_SIV");
        if (r02 == null) goto L69;
        r4.f196b = r02;
        r4.f197c = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        r4.f198d = r22;
        String r62 = AbstractC0213Ey.m420r("android-keystore://", r12);
        if (r62.startsWith("android-keystore://") == false) goto L67;
        r4.f199e = r62;
        C0132D2 r42 = r4.m139a();
        monitor-enter(r42);
        C2656w4 r63 = ((C1017Xm) r42.f328b).m1910g();     // Catch: Throwable -> L63
        monitor-exit(r42);
        C0089C2 r43 = new C0089C2();
        r43.f201g = AbstractC1406fG.m2694T("AES256_GCM");
        r43.f196b = r02;
        r43.f197c = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        r43.f198d = r22;
        String r13 = AbstractC0213Ey.m420r("android-keystore://", r12);
        if (r13.startsWith("android-keystore://") == false) goto L62;
        r43.f199e = r13;
        C0132D2 r14 = r43.m139a();
        monitor-enter(r14);
        C2656w4 r44 = ((C1017Xm) r14.f328b).m1910g();     // Catch: Throwable -> L58
        monitor-exit(r14);
        InterfaceC2714xd r15 = (InterfaceC2714xd) r63.m5214v(InterfaceC2714xd.class);
        SharedPreferencesC0967Wf r54 = new SharedPreferencesC0967Wf(r22, r02.getSharedPreferences(r22, 0), (InterfaceC1435g1) r44.m5214v(InterfaceC1435g1.class), r15);
        AbstractC0295Gu.m625r(-563744522369077L);
        return r54;
    L58:
        th = move-exception;
        throw th;
    L62:
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    L63:
        th = move-exception;
        throw th;
    L67:
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    L69:
        throw new IllegalArgumentException("need an Android context");
    L155:
        KeyGenerator r55 = KeyGenerator.getInstance("AES", "AndroidKeyStore");     // Catch: ProviderException -> L34 Throwable -> L70
        r55.init(r1);     // Catch: ProviderException -> L34 Throwable -> L70
        r55.generateKey();     // Catch: ProviderException -> L34 Throwable -> L70
    L34:
        e = move-exception;
        throw new GeneralSecurityException(e.getMessage(), e);     // Catch: Throwable -> L70
    L70:
        th = move-exception;
        throw th;
    L24:
        if (r1.getUserAuthenticationValidityDurationSeconds() >= 1) goto L28;
        throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
    L74:
        throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(r1.getEncryptionPaddings()));
    L76:
        throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + r1.getPurposes());
    L78:
        throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(r1.getBlockModes()));
    L80:
        throw new IllegalArgumentException("invalid key size, want 256 bits got " + r1.getKeySize() + " bits");
    L82:
        throw new NullPointerException("KeyGenParameterSpec was null after build() check");
    L83:
        Context r03 = MainApplication.f5549a;
        if (r03 != null) goto L91;
        r03 = C1456gf.f5172p;
        if (r03 != null) goto L91;
        r03 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L91:
        return r03.getSharedPreferences(AbstractC0295Gu.m625r(-463981022017589L), 0);
    L102:
        C0128Cz r3 = C0128Cz.f301j;
        InterfaceC0126Cx[] r04 = new InterfaceC0126Cx[0];
        if (AbstractC2564tz.m5059T("kotlin.Unit") == true) goto L111;
        if (r3.equals(C0128Cz.f298g) == true) goto L109;
        C0268G9 r64 = new C0268G9("kotlin.Unit");
        return new C0212Ex("kotlin.Unit", r3, r64.f860b.size(), AbstractC0650P4.m1316K(r04), r64);
    L109:
        throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
    L111:
        throw new IllegalArgumentException("Blank serial names are prohibited");
    L93:
        return UpdateItem.m3554a();
    L95:
        return ThemeStoreData.m3553a();
    L97:
        return ThemeSimpleItem.m3552a();
    L99:
        return ThemeSimpleData.m3551a();
    L101:
        return SavedMusicList.m3550a();
    L113:
        return MusicTrack.m3549a();
    L115:
        return MusicPlaylistResult.m3548a();
    L117:
        return C2328om.f8173b;
    L119:
        return C0287Gm.f932b;
    L121:
        return AbstractC0115Cm.f275a;
    L123:
        return C0201Em.f608b;
    L125:
        return C0330Hm.f1132b;
    L127:
        return FriendLinkData.m3547a();
    L129:
        return FAQCategory.m3546a();
    L131:
        return DeveloperGroups.m3544a();
    L133:
        return DeveloperGroups.m3545b();
    L135:
        return CustomerData.m3543a();
    L137:
        return CherryViewAPI.m3317p();
    L139:
        return CherryViewAPI.m3276R0();
    L141:
        return AuthorizedThemeData.m3542a();
    L143:
        return AnnouncementsWrapper.m3541a();
    L145:
        return AnnouncementItem.m3540a();
    L147:
        return AdListData.m3539a();
    L149:
        return AboutData.m3537a();
    L151:
        return AboutData.m3538b();
    }

    public /* synthetic */ C1302d(C1426ft r1) {
        this.f4744a = 20;
    }
}
