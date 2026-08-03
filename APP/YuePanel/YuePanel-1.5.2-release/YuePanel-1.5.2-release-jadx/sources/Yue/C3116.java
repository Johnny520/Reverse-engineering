package Yue;

import Yue.AbstractC3115;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3116 {

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ */
    public static class C0056 extends AbstractC3115<Uri, Boolean> {
        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        @InterfaceC3647
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6399 Uri uri) {
            C5499.m17103(context, "context");
            C5499.m17103(uri, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            C5499.m17102(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final AbstractC3115.C0055<Boolean> mo217(@InterfaceC6399 Context context, @InterfaceC6399 Uri uri) {
            C5499.m17103(context, "context");
            C5499.m17103(uri, "input");
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Boolean mo6351(int i, @InterfaceC6489 Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class C3117 extends AbstractC3115<String, Uri> {
        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        @InterfaceC3647
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6399 String str) {
            C5499.m17103(context, "context");
            C5499.m17103(str, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
            C5499.m17102(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final AbstractC3115.C0055<Uri> mo217(@InterfaceC6399 Context context, @InterfaceC6399 String str) {
            C5499.m17103(context, "context");
            C5499.m17103(str, "input");
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Uri mo6351(int i, @InterfaceC6489 Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(18)
    public static class C3118 extends AbstractC3115<String, List<Uri>> {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C0058 f82 = new C0058(null);

        /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟$ۥ */
        @InterfaceC7113(18)
        public static final class C0058 {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟۟ۨ.ۥ۟۟۟.ۥ.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C0058(C4335 c4335) {
                this();
            }

            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ */
            public final List<Uri> m219(@InterfaceC6399 Intent intent) {
                C5499.m17103(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return C3880.m10735();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        Uri uri = clipData.getItemAt(i).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C0058() {
            }
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        @InterfaceC3647
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6399 String str) {
            C5499.m17103(context, "context");
            C5499.m17103(str, "input");
            Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            C5499.m17102(intentPutExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return intentPutExtra;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final AbstractC3115.C0055<List<Uri>> mo217(@InterfaceC6399 Context context, @InterfaceC6399 String str) {
            C5499.m17103(context, "context");
            C5499.m17103(str, "input");
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final List<Uri> mo6351(int i, @InterfaceC6489 Intent intent) {
            List<Uri> listM219;
            if (i != -1) {
                intent = null;
            }
            return (intent == null || (listM219 = f82.m219(intent)) == null) ? C3880.m10735() : listM219;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(19)
    @InterfaceC7507({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class C3119 extends AbstractC3115<String[], Uri> {
        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        @InterfaceC3647
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6399 String[] strArr) {
            C5499.m17103(context, "context");
            C5499.m17103(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
            C5499.m17102(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final AbstractC3115.C0055<Uri> mo217(@InterfaceC6399 Context context, @InterfaceC6399 String[] strArr) {
            C5499.m17103(context, "context");
            C5499.m17103(strArr, "input");
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Uri mo6351(int i, @InterfaceC6489 Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7113(21)
    @InterfaceC7507({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class C3120 extends AbstractC3115<Uri, Uri> {
        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        @InterfaceC3647
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6489 Uri uri) {
            C5499.m17103(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final AbstractC3115.C0055<Uri> mo217(@InterfaceC6399 Context context, @InterfaceC6489 Uri uri) {
            C5499.m17103(context, "context");
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Uri mo6351(int i, @InterfaceC6489 Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7113(19)
    public static class C3121 extends AbstractC3115<String[], List<Uri>> {
        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        @InterfaceC3647
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6399 String[] strArr) {
            C5499.m17103(context, "context");
            C5499.m17103(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            C5499.m17102(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final AbstractC3115.C0055<List<Uri>> mo217(@InterfaceC6399 Context context, @InterfaceC6399 String[] strArr) {
            C5499.m17103(context, "context");
            C5499.m17103(strArr, "input");
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final List<Uri> mo6351(int i, @InterfaceC6489 Intent intent) {
            List<Uri> listM219;
            if (i != -1) {
                intent = null;
            }
            return (intent == null || (listM219 = C3118.f82.m219(intent)) == null) ? C3880.m10735() : listM219;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickContact\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static final class C3122 extends AbstractC3115<Void, Uri> {
        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6489 Void r2) {
            C5499.m17103(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            C5499.m17102(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Uri mo6351(int i, @InterfaceC6489 Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(19)
    public static class C3123 extends AbstractC3115<C6662, List<Uri>> {

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public static final C0059 f83 = new C0059(null);

        /* JADX INFO: renamed from: ۥ */
        public final int f84;

        /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥۣ۟۟۟$ۥ */
        public static final class C0059 {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟۟ۨ.ۥۣ۟۟۟.ۥ.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C0059(C4335 c4335) {
                this();
            }

            @SuppressLint({"NewApi", "ClassVerificationFailure"})
            /* JADX INFO: renamed from: ۥ */
            public final int m220() {
                if (C3124.f85.m6395()) {
                    return MediaStore.getPickImagesMaxLimit();
                }
                return Integer.MAX_VALUE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C0059() {
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C3123() {
            this(0, 1, null);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        @InterfaceC3647
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6399 C6662 c6662) {
            C5499.m17103(context, "context");
            C5499.m17103(c6662, "input");
            C3124.C0060 c0060 = C3124.f85;
            if (c0060.m6395()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(c0060.m6390(c6662.m3147()));
                if (this.f84 > MediaStore.getPickImagesMaxLimit()) {
                    throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f84);
                return intent;
            }
            if (c0060.m6394(context)) {
                ResolveInfo resolveInfoM6389 = c0060.m6389(context);
                if (resolveInfoM6389 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo = resolveInfoM6389.activityInfo;
                Intent intent2 = new Intent(C3124.f86);
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(c0060.m6390(c6662.m3147()));
                intent2.putExtra(C3124.f4641, this.f84);
                return intent2;
            }
            if (c0060.m6391(context)) {
                ResolveInfo resolveInfoM6388 = c0060.m6388(context);
                if (resolveInfoM6388 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo2 = resolveInfoM6388.activityInfo;
                Intent intent3 = new Intent(C3124.f4640);
                intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent3.putExtra(C3124.f4641, this.f84);
                return intent3;
            }
            Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent4.setType(c0060.m6390(c6662.m3147()));
            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent4.getType() != null) {
                return intent4;
            }
            intent4.setType("*/*");
            intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            return intent4;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final AbstractC3115.C0055<List<Uri>> mo217(@InterfaceC6399 Context context, @InterfaceC6399 C6662 c6662) {
            C5499.m17103(context, "context");
            C5499.m17103(c6662, "input");
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final List<Uri> mo6351(int i, @InterfaceC6489 Intent intent) {
            List<Uri> listM219;
            if (i != -1) {
                intent = null;
            }
            return (intent == null || (listM219 = C3118.f82.m219(intent)) == null) ? C3880.m10735() : listM219;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0006: INVOKE (wrap:Yue.ۥۣ۟۟ۨ$ۥۣ۟۟۟$ۥ:0x0004: SGET  A[WRAPPED] (LINE:2) Yue.ۥۣ۟۟ۨ.ۥۣ۟۟۟.ۥ۟ Yue.ۥۣ۟۟ۨ$ۥۣ۟۟۟$ۥ) VIRTUAL call: Yue.ۥۣ۟۟ۨ.ۥۣ۟۟۟.ۥ.ۥ():int A[MD:():int (m), WRAPPED] (LINE:2)) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:3) call: Yue.ۥۣ۟۟ۨ.ۥۣ۟۟۟.<init>(int):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ C3123(int i, int i2, C4335 c4335) {
            this((i2 & 1) != 0 ? f83.m220() : i);
        }

        public C3123(int i) {
            this.f84 = i;
            if (i <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1".toString());
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC7113(19)
    @InterfaceC7507({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class C3124 extends AbstractC3115<C6662, Uri> {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C0060 f85 = new C0060(null);

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public static final String f86 = "androidx.activity.result.contract.action.PICK_IMAGES";

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public static final String f4639 = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public static final String f4640 = "com.google.android.gms.provider.action.PICK_IMAGES";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public static final String f4641 = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ */
        public static final class C0060 {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟۟ۨ.ۥ۟۟۟ۤ.ۥ.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C0060(C4335 c4335) {
                this();
            }

            /* JADX INFO: renamed from: ۥ */
            public static /* synthetic */ void m221() {
            }

            /* JADX INFO: renamed from: ۥ۟ */
            public static /* synthetic */ void m222() {
            }

            @InterfaceC5578
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final ResolveInfo m6388(@InterfaceC6399 Context context) {
                C5499.m17103(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(C3124.f4640), 1114112);
            }

            @InterfaceC5578
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public final ResolveInfo m6389(@InterfaceC6399 Context context) {
                C5499.m17103(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(C3124.f86), 1114112);
            }

            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public final String m6390(@InterfaceC6399 InterfaceC3128 interfaceC3128) {
                C5499.m17103(interfaceC3128, "input");
                if (interfaceC3128 instanceof C3125) {
                    return "image/*";
                }
                if (interfaceC3128 instanceof C3127) {
                    return "video/*";
                }
                if (interfaceC3128 instanceof C3126) {
                    return ((C3126) interfaceC3128).m223();
                }
                if (interfaceC3128 instanceof C0061) {
                    return null;
                }
                throw new C6380();
            }

            @InterfaceC5578
            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public final boolean m6391(@InterfaceC6399 Context context) {
                C5499.m17103(context, "context");
                return m6388(context) != null;
            }

            @InterfaceC5578
            @InterfaceC4372(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @InterfaceC7097(expression = "isPhotoPickerAvailable(context)", imports = {}))
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public final boolean m6392() {
                return m6395();
            }

            @InterfaceC5578
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public final boolean m6393(@InterfaceC6399 Context context) {
                C5499.m17103(context, "context");
                return m6395() || m6394(context) || m6391(context);
            }

            @InterfaceC5578
            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public final boolean m6394(@InterfaceC6399 Context context) {
                C5499.m17103(context, "context");
                return m6389(context) != null;
            }

            @InterfaceC5578
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
            public final boolean m6395() {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    return true;
                }
                return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C0060() {
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟ */
        public static final class C0061 implements InterfaceC3128 {

            /* JADX INFO: renamed from: ۥ */
            @InterfaceC6399
            public static final C0061 f87 = new C0061();
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟, reason: contains not printable characters */
        public static final class C3125 implements InterfaceC3128 {

            /* JADX INFO: renamed from: ۥ */
            @InterfaceC6399
            public static final C3125 f88 = new C3125();
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟, reason: contains not printable characters */
        public static final class C3126 implements InterfaceC3128 {

            /* JADX INFO: renamed from: ۥ */
            @InterfaceC6399
            public final String f89;

            public C3126(@InterfaceC6399 String str) {
                C5499.m17103(str, "mimeType");
                this.f89 = str;
            }

            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ */
            public final String m223() {
                return this.f89;
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۟, reason: contains not printable characters */
        public static final class C3127 implements InterfaceC3128 {

            /* JADX INFO: renamed from: ۥ */
            @InterfaceC6399
            public static final C3127 f90 = new C3127();
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠, reason: contains not printable characters */
        public interface InterfaceC3128 {
        }

        @InterfaceC5578
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final ResolveInfo m6378(@InterfaceC6399 Context context) {
            return f85.m6388(context);
        }

        @InterfaceC5578
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final ResolveInfo m6379(@InterfaceC6399 Context context) {
            return f85.m6389(context);
        }

        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final boolean m6380(@InterfaceC6399 Context context) {
            return f85.m6391(context);
        }

        @InterfaceC5578
        @InterfaceC4372(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @InterfaceC7097(expression = "isPhotoPickerAvailable(context)", imports = {}))
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final boolean m6381() {
            return f85.m6392();
        }

        @InterfaceC5578
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final boolean m6382(@InterfaceC6399 Context context) {
            return f85.m6393(context);
        }

        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final boolean m6383(@InterfaceC6399 Context context) {
            return f85.m6394(context);
        }

        @InterfaceC5578
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final boolean m6384() {
            return f85.m6395();
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        @InterfaceC3647
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6399 C6662 c6662) {
            Intent intent;
            C5499.m17103(context, "context");
            C5499.m17103(c6662, "input");
            C0060 c0060 = f85;
            if (c0060.m6395()) {
                Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
                intent2.setType(c0060.m6390(c6662.m3147()));
                return intent2;
            }
            if (c0060.m6394(context)) {
                ResolveInfo resolveInfoM6389 = c0060.m6389(context);
                if (resolveInfoM6389 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo = resolveInfoM6389.activityInfo;
                intent = new Intent(f86);
                intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.setType(c0060.m6390(c6662.m3147()));
            } else {
                if (!c0060.m6391(context)) {
                    Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent3.setType(c0060.m6390(c6662.m3147()));
                    if (intent3.getType() != null) {
                        return intent3;
                    }
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent3;
                }
                ResolveInfo resolveInfoM6388 = c0060.m6388(context);
                if (resolveInfoM6388 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ActivityInfo activityInfo2 = resolveInfoM6388.activityInfo;
                intent = new Intent(f4640);
                intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent.setType(c0060.m6390(c6662.m3147()));
            }
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final AbstractC3115.C0055<Uri> mo217(@InterfaceC6399 Context context, @InterfaceC6399 C6662 c6662) {
            C5499.m17103(context, "context");
            C5499.m17103(c6662, "input");
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Uri mo6351(int i, @InterfaceC6489 Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            if (data == null) {
                data = (Uri) C3888.m10891(C3118.f82.m219(intent));
            }
            return data;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12541#2,2:960\n8676#2,2:962\n9358#2,4:964\n11365#2:968\n11700#2,3:969\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n*L\n188#1:960,2\n195#1:962,2\n195#1:964,4\n208#1:968\n208#1:969,3\n*E\n"})
    public static final class C3129 extends AbstractC3115<String[], Map<String, Boolean>> {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C0062 f91 = new C0062(null);

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public static final String f92 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public static final String f4642 = "androidx.activity.result.contract.extra.PERMISSIONS";

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public static final String f4643 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۥ$ۥ */
        public static final class C0062 {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟۟ۨ.ۥ۟۟۟ۥ.ۥ.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C0062(C4335 c4335) {
                this();
            }

            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ */
            public final Intent m224(@InterfaceC6399 String[] strArr) {
                C5499.m17103(strArr, "input");
                Intent intentPutExtra = new Intent(C3129.f92).putExtra(C3129.f4642, strArr);
                C5499.m17102(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C0062() {
            }
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6399 String[] strArr) {
            C5499.m17103(context, "context");
            C5499.m17103(strArr, "input");
            return f91.m224(strArr);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public AbstractC3115.C0055<Map<String, Boolean>> mo217(@InterfaceC6399 Context context, @InterfaceC6399 String[] strArr) {
            C5499.m17103(context, "context");
            C5499.m17103(strArr, "input");
            if (strArr.length == 0) {
                return new AbstractC3115.C0055<>(C5943.m18584());
            }
            for (String str : strArr) {
                if (C4187.m1143(context, str) != 0) {
                    return null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C7007.m21661(C5942.m18568(strArr.length), 16));
            for (String str2 : strArr) {
                C6599 c6599M4014 = C8003.m4014(str2, Boolean.TRUE);
                linkedHashMap.put(c6599M4014.m20938(), c6599M4014.m20939());
            }
            return new AbstractC3115.C0055<>(linkedHashMap);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Map<String, Boolean> mo6351(int i, @InterfaceC6489 Intent intent) {
            if (i == -1 && intent != null) {
                String[] stringArrayExtra = intent.getStringArrayExtra(f4642);
                int[] intArrayExtra = intent.getIntArrayExtra(f4643);
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return C5943.m18584();
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                return C5943.m18640(C3888.m11075(C3411.m7691(stringArrayExtra), arrayList));
            }
            return C5943.m18584();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12774#2,2:960\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n*L\n228#1:960,2\n*E\n"})
    public static final class C3130 extends AbstractC3115<String, Boolean> {
        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6399 String str) {
            C5499.m17103(context, "context");
            C5499.m17103(str, "input");
            return C3129.f91.m224(new String[]{str});
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public AbstractC3115.C0055<Boolean> mo217(@InterfaceC6399 Context context, @InterfaceC6399 String str) {
            C5499.m17103(context, "context");
            C5499.m17103(str, "input");
            if (C4187.m1143(context, str) == 0) {
                return new AbstractC3115.C0055<>(Boolean.TRUE);
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Boolean mo6351(int i, @InterfaceC6489 Intent intent) {
            if (intent == null || i != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(C3129.f4643);
            boolean z = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (intArrayExtra[i2] == 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final class C3131 extends AbstractC3115<Intent, C3112> {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C0063 f93 = new C0063(null);

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public static final String f94 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۧ$ۥ */
        public static final class C0063 {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟۟ۨ.ۥ۟۟۟ۧ.ۥ.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C0063(C4335 c4335) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C0063() {
            }
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6399 Intent intent) {
            C5499.m17103(context, "context");
            C5499.m17103(intent, "input");
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C3112 mo6351(int i, @InterfaceC6489 Intent intent) {
            return new C3112(i, intent);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final class C3132 extends AbstractC3115<C5488, C3112> {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C0064 f95 = new C0064(null);

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public static final String f96 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public static final String f4644 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public static final String f4645 = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۟ۨ$ۥ */
        public static final class C0064 {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟۟ۨ.ۥ۟۟۟ۨ.ۥ.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C0064(C4335 c4335) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C0064() {
            }
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6399 C5488 c5488) {
            C5499.m17103(context, "context");
            C5499.m17103(c5488, "input");
            Intent intentPutExtra = new Intent(f96).putExtra(f4644, c5488);
            C5499.m17102(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return intentPutExtra;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C3112 mo6351(int i, @InterfaceC6489 Intent intent) {
            return new C3112(i, intent);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۠, reason: contains not printable characters */
    public static class C3133 extends AbstractC3115<Uri, Boolean> {
        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        @InterfaceC3647
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6399 Uri uri) {
            C5499.m17103(context, "context");
            C5499.m17103(uri, "input");
            Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
            C5499.m17102(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final AbstractC3115.C0055<Boolean> mo217(@InterfaceC6399 Context context, @InterfaceC6399 Uri uri) {
            C5499.m17103(context, "context");
            C5499.m17103(uri, "input");
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Boolean mo6351(int i, @InterfaceC6489 Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۠۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class C3134 extends AbstractC3115<Void, Bitmap> {
        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        @InterfaceC3647
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6489 Void r2) {
            C5499.m17103(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final AbstractC3115.C0055<Bitmap> mo217(@InterfaceC6399 Context context, @InterfaceC6489 Void r2) {
            C5499.m17103(context, "context");
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Bitmap mo6351(int i, @InterfaceC6489 Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟۟۠۠, reason: contains not printable characters */
    @InterfaceC4372(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    @InterfaceC7507({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakeVideo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class C3135 extends AbstractC3115<Uri, Bitmap> {
        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        @InterfaceC3647
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6399 Uri uri) {
            C5499.m17103(context, "context");
            C5499.m17103(uri, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            C5499.m17102(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final AbstractC3115.C0055<Bitmap> mo217(@InterfaceC6399 Context context, @InterfaceC6399 Uri uri) {
            C5499.m17103(context, "context");
            C5499.m17103(uri, "input");
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Bitmap mo6351(int i, @InterfaceC6489 Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۨ$ۥ۟ */
    @InterfaceC7113(19)
    @InterfaceC7507({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$CreateDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,959:1\n1#2:960\n*E\n"})
    public static class C0057 extends AbstractC3115<String, Uri> {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final String f81;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0057(@InterfaceC6399 String str) {
            C5499.m17103(str, "mimeType");
            this.f81 = str;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // Yue.AbstractC3115
        @InterfaceC6399
        @InterfaceC3647
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo216(@InterfaceC6399 Context context, @InterfaceC6399 String str) {
            C5499.m17103(context, "context");
            C5499.m17103(str, "input");
            Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f81).putExtra("android.intent.extra.TITLE", str);
            C5499.m17102(intentPutExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return intentPutExtra;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final AbstractC3115.C0055<Uri> mo217(@InterfaceC6399 Context context, @InterfaceC6399 String str) {
            C5499.m17103(context, "context");
            C5499.m17103(str, "input");
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // Yue.AbstractC3115
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Uri mo6351(int i, @InterfaceC6489 Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @InterfaceC4372(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @InterfaceC7097(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public C0057() {
            this("*/*");
        }
    }
}
