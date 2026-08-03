.class public final L۟/k8$b;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/k8;->ۥ۟ۡ(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final ۥ:L۟/k8;


# direct methods
.method public constructor <init>(L۟/k8;)V
    .locals 0

    iput-object p1, p0, L۟/k8$b;->ۥ:L۟/k8;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    const/4 v6, 0x6

    const/4 v0, 0x5

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    new-array v1, v6, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/16 v1, 0x3c

    new-array v1, v1, [B

    fill-array-data v1, :array_2

    new-array v2, v6, [B

    fill-array-data v2, :array_3

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Landroid/app/Application;

    sget-object v1, L۟/q;->ۥ۟:L۟/kb;

    const v2, -0x21b99009

    const-string v1, "\u06e6\u06e7\u06e8\u06d8\u06ec\u06d9\u06db\u06d8\u06dc\u06e2\u06e8\u06e1\u06e6\u06d8\u06e5\u06e5\u06e6\u06d8\u06db\u06e5\u06e7\u06d8\u06e1\u06e6\u06e1\u06d8\u06e1\u06e7\u06df\u06df\u06e1\u06e8\u06eb\u06e1\u06e5\u06db\u06eb\u06e8\u06d8\u06df\u06da\u06e8\u06da\u06eb\u06d6\u06e4\u06e8\u06d8\u06e7\u06eb\u06da\u06e8\u06e2\u06df\u06d6\u06eb\u06e8\u06d8\u06e2\u06d6\u06e7\u06e5\u06db\u06db\u06e7\u06e2\u06e7\u06e8\u06d9\u06d6\u06d8"

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    xor-int/2addr v3, v2

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const v3, -0x19388961

    const-string v1, "\u06e7\u06d8\u06e1\u06d8\u06df\u06e2\u06df\u06e0\u06db\u06e4\u06e7\u06d7\u06e1\u06d8\u06e6\u06e0\u06e1\u06d9\u06e4\u06d7\u06e5\u06d6\u06d9\u06e8\u06d9\u06e8\u06da\u06e1\u06da\u06df\u06d8\u06e6\u06db\u06e0\u06d9\u06e1\u06d8\u06e4\u06ec\u06dc\u06dc\u06da\u06e6\u06d8\u06e2\u06e1\u06d6\u06d8\u06e0\u06d9\u06da\u06db\u06df\u06db\u06db\u06d8\u06e8\u06d7\u06e8\u06eb\u06e5\u06d9\u06dc\u06e6\u06e4\u06db\u06dc\u06d8\u06e2\u06eb\u06d9\u06e1\u06d8\u06df\u06e6\u06d7\u06e7\u06e6\u06e8\u06d8\u06eb\u06e2\u06d9\u06e1\u06e1\u06e5"

    :goto_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v4, v3

    sparse-switch v4, :sswitch_data_1

    goto :goto_1

    :sswitch_1
    const-string v1, "\u06e1\u06ec\u06da\u06db\u06db\u06e8\u06d8\u06d8\u06dc\u06e8\u06eb\u06e0\u06d8\u06e8\u06d6\u06e8\u06db\u06e5\u06e2\u06db\u06d6\u06d8\u06d8\u06e8\u06e4\u06e5\u06eb\u06e7\u06e7\u06d6\u06db\u06e1\u06ec\u06e8\u06d8\u06dc\u06e8\u06e2\u06d9\u06e2\u06e5\u06d8\u06e7\u06db\u06e6\u06d8\u06da\u06d8\u06e8\u06d6\u06eb\u06ec\u06d9\u06d7\u06d6\u06d8\u06db\u06e6\u06e1\u06e4\u06d8\u06dc\u06d8\u06e0\u06e7\u06e8\u06e8\u06d8\u06e7\u06d7\u06e5\u06e7\u06d8\u06e6\u06e5\u06e2\u06e7\u06e6\u06e5\u06d8"

    goto :goto_0

    :sswitch_2
    const-string v1, "\u06eb\u06d6\u06d7\u06d8\u06df\u06da\u06e0\u06e0\u06dc\u06eb\u06e0\u06e1\u06d8\u06e6\u06e5\u06d9\u06eb\u06d8\u06e6\u06e2\u06e6\u06dc\u06d8\u06d7\u06da\u06d9\u06d7\u06e6\u06e5\u06e6\u06d6\u06e0\u06d7\u06e8\u06dc\u06d8\u06e2\u06e6\u06d8\u06d8\u06d8\u06db\u06db\u06da\u06e5\u06e2\u06d8\u06e4\u06eb\u06e1\u06d7\u06d9\u06d9\u06e8\u06d6\u06e5\u06e0\u06eb\u06d6\u06e7\u06dc\u06e5\u06eb\u06d9\u06e0\u06e8\u06e2\u06e0\u06e4\u06e0\u06da\u06e6\u06da\u06e5\u06d6\u06eb\u06e8\u06d8\u06da\u06ec\u06e5\u06da\u06da\u06eb"

    goto :goto_1

    :sswitch_3
    const v4, 0x6be01764

    const-string v1, "\u06e7\u06dc\u06e7\u06d8\u06e7\u06db\u06eb\u06ec\u06e0\u06e7\u06da\u06d6\u06d8\u06db\u06e7\u06eb\u06e1\u06dc\u06d8\u06d8\u06e1\u06e2\u06da\u06e4\u06e1\u06d8\u06e4\u06d9\u06d6\u06d8\u06d7\u06d8\u06d9\u06e8\u06d9\u06d6\u06e7\u06d9\u06d8\u06e1\u06ec\u06dc\u06d7\u06e1\u06d8\u06e6\u06d8\u06d6\u06d8\u06dc\u06e2\u06e7\u06e0\u06df\u06d7\u06ec\u06dc\u06d8\u06e5\u06db\u06e8\u06d8\u06e8\u06e0\u06d6\u06d8\u06e2\u06df\u06e5\u06d8\u06d7\u06e5\u06e4\u06e8\u06e0\u06e8\u06d8\u06dc\u06d9\u06e1"

    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v5

    xor-int/2addr v5, v4

    sparse-switch v5, :sswitch_data_2

    goto :goto_2

    :sswitch_4
    const-string v1, "\u06e8\u06e0\u06d8\u06e6\u06e1\u06e7\u06d8\u06df\u06ec\u06e2\u06ec\u06d8\u06d8\u06db\u06da\u06d8\u06d8\u06e2\u06e6\u06e4\u06db\u06e8\u06d7\u06e1\u06ec\u06d7\u06e7\u06df\u06e1\u06e4\u06df\u06e8\u06d8\u06e6\u06d8\u06e4\u06df\u06ec\u06e6\u06d8\u06e8\u06e2\u06e4\u06e5\u06e6\u06e2\u06e5\u06d6\u06e5\u06d8\u06da\u06e7\u06eb\u06e5\u06d6\u06e0\u06e1\u06d6\u06e4"

    goto :goto_1

    :cond_0
    const-string v1, "\u06e6\u06d7\u06dc\u06d8\u06e5\u06d9\u06e2\u06d6\u06e2\u06e6\u06d8\u06eb\u06d8\u06e1\u06d8\u06da\u06ec\u06dc\u06d8\u06dc\u06d6\u06d9\u06d7\u06dc\u06d6\u06d8\u06e0\u06d8\u06d8\u06e5\u06ec\u06ec\u06dc\u06df\u06dc\u06d8\u06e5\u06d7\u06db\u06eb\u06e8\u06db\u06df\u06e2\u06e1\u06d7\u06eb\u06e2\u06eb\u06e8\u06d8\u06e4\u06d8\u06d7\u06da\u06e8\u06ec\u06e6\u06d6\u06d8"

    goto :goto_2

    :sswitch_5
    invoke-static {v0}, L۟/q$c;->ۥ۟ۡ(Landroid/app/Application;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "\u06e1\u06ec\u06da\u06da\u06df\u06d6\u06db\u06db\u06e6\u06e5\u06e8\u06e5\u06d8\u06d8\u06e4\u06e5\u06e2\u06e5\u06dc\u06df\u06ec\u06e5\u06d8\u06ec\u06d8\u06e5\u06d8\u06d7\u06ec\u06e5\u06d8\u06db\u06e1\u06e7\u06da\u06ec\u06ec\u06e8\u06d8\u06e6\u06eb\u06ec\u06df\u06df\u06dc\u06d8\u06e4\u06e1\u06e1\u06d8\u06e6\u06e2\u06d8\u06d8\u06dc\u06eb\u06e4\u06e2\u06e5\u06e6\u06e6\u06e7\u06e2\u06e6\u06e6\u06e7\u06d8\u06d8\u06da\u06e1\u06d8"

    goto :goto_2

    :sswitch_6
    const-string v1, "\u06e1\u06e2\u06db\u06ec\u06e5\u06d6\u06d8\u06e4\u06dc\u06dc\u06d8\u06e6\u06e8\u06d6\u06d8\u06eb\u06d8\u06ec\u06d9\u06e1\u06da\u06db\u06eb\u06ec\u06e6\u06da\u06d6\u06df\u06e0\u06e1\u06df\u06da\u06e4\u06d6\u06e8\u06e6\u06d7\u06da\u06d9\u06dc\u06ec\u06eb\u06e0\u06e2\u06eb\u06e0\u06d6\u06e2\u06dc\u06d8\u06e4\u06e1\u06e5\u06e1\u06df\u06da\u06e7\u06e0\u06dc\u06d8\u06d6\u06e1\u06e8\u06d8\u06df\u06e8\u06e5\u06d8\u06e5\u06e1\u06e7\u06e7\u06e8\u06d6\u06d8\u06e7\u06df\u06e2"

    goto :goto_2

    :sswitch_7
    const-string v1, "\u06ec\u06eb\u06e6\u06da\u06d9\u06d8\u06d9\u06eb\u06d7\u06e8\u06e7\u06e4\u06e5\u06d8\u06d8\u06e4\u06db\u06e7\u06df\u06ec\u06e4\u06e1\u06e6\u06e4\u06da\u06e5\u06e5\u06e2\u06df\u06e6\u06df\u06e1\u06d8\u06ec\u06df\u06e2\u06e6\u06db\u06dc\u06e6\u06e7\u06da\u06d7\u06e6"

    goto :goto_1

    :sswitch_8
    const-string v1, "\u06d7\u06e5\u06e7\u06d8\u06e4\u06e0\u06e6\u06d8\u06e8\u06d8\u06e0\u06ec\u06db\u06df\u06e7\u06e5\u06d8\u06e1\u06e5\u06eb\u06e6\u06da\u06e1\u06d8\u06e0\u06db\u06eb\u06ec\u06eb\u06d9\u06d7\u06d8\u06e2\u06d7\u06e5\u06e0\u06df\u06e6\u06e0\u06e8\u06ec\u06e5\u06db\u06e6\u06db\u06e8\u06d8\u06ec\u06e5\u06e4\u06eb\u06e7\u06eb\u06e4\u06e4\u06e2\u06e1\u06da\u06e4\u06da\u06e7\u06db\u06e7\u06d7\u06d8\u06eb\u06d9\u06d6\u06e6\u06d7\u06e5\u06e4\u06e7\u06da"

    goto :goto_0

    :sswitch_9
    const-string v1, "\u06e0\u06d6\u06e6\u06d8\u06e8\u06d8\u06e1\u06e2\u06d7\u06df\u06df\u06e2\u06df\u06da\u06d6\u06d8\u06e0\u06e0\u06e5\u06e5\u06db\u06db\u06e2\u06d8\u06e6\u06e1\u06d8\u06d8\u06d8\u06e7\u06e4\u06d6\u06d8\u06e7\u06d7\u06e7\u06e7\u06df\u06d7\u06eb\u06df\u06d6\u06e7\u06db\u06e8\u06d8\u06e0\u06e4\u06d8\u06d8\u06e6\u06df\u06e1\u06d6\u06ec\u06d6\u06d8\u06eb\u06e6\u06e8\u06d8\u06e5\u06e7\u06e7\u06db\u06dc\u06e4\u06db\u06eb\u06e6\u06d8"

    goto :goto_0

    :sswitch_a
    iget-object v1, p0, L۟/k8$b;->ۥ:L۟/k8;

    invoke-virtual {v1, v0}, L۟/q;->ۥ۟۟(Landroid/app/Application;)V

    sget-object v1, L۟/k8;->ۥۣ۟:L۟/k;

    const/16 v1, 0x19

    new-array v1, v1, [B

    fill-array-data v1, :array_4

    new-array v2, v6, [B

    fill-array-data v2, :array_5

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, L۟/ca;->ۥ۟(Landroid/app/Application;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, L۟/k8$a;->ۥ۟۠(Ljava/lang/String;)V

    const/16 v1, 0x25

    :try_start_0
    new-array v1, v1, [B

    fill-array-data v1, :array_6

    const/4 v2, 0x6

    new-array v2, v2, [B

    fill-array-data v2, :array_7

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    sget-object v1, L۟/d1;->ۥ:L۟/kb;

    new-instance v1, L۟/ea;

    invoke-direct {v1}, L۟/ea;-><init>()V

    invoke-static {v1}, L۟/d1$b;->ۥ۟(L۟/ea;)V

    :try_start_1
    invoke-static {}, L۟/k8$a;->ۥ()Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase;

    invoke-static {}, L۟/q$c;->ۥ۟۟()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, L۟/l8;

    invoke-direct {v2}, L۟/l8;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_3
    sget v1, L۟/u3;->ۥ۟۟:I

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v1}, L۟/u3$a;->ۥ(Ljava/lang/ClassLoader;)V

    new-instance v1, L۟/h2;

    invoke-direct {v1}, L۟/h2;-><init>()V

    invoke-static {v1}, L۟/a4$a;->ۥ(L۟/h2;)V

    sget-object v1, L۟/m;->ۥ:L۟/m;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x27fa9213

    const-string v1, "\u06e4\u06e8\u06db\u06e5\u06da\u06db\u06d7\u06e1\u06d8\u06e1\u06e5\u06d7\u06df\u06e2\u06ec\u06db\u06eb\u06d8\u06d8\u06e1\u06e2\u06ec\u06d7\u06d8\u06d6\u06d8\u06df\u06d6\u06e5\u06d8\u06e5\u06e4\u06e0\u06d8\u06df\u06e6\u06d8\u06d6\u06d9\u06eb\u06e0\u06e4\u06db\u06e5\u06e2\u06d6\u06e4\u06e8\u06e1\u06e2\u06e2\u06e0\u06d6\u06d8\u06e2\u06db\u06e1\u06d8"

    :goto_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    xor-int/2addr v3, v2

    sparse-switch v3, :sswitch_data_3

    goto :goto_4

    :sswitch_b
    const v3, 0x68468855

    const-string v1, "\u06e0\u06d7\u06eb\u06db\u06e5\u06e2\u06d9\u06d7\u06e2\u06eb\u06d7\u06e0\u06dc\u06d8\u06d8\u06df\u06d6\u06d7\u06db\u06da\u06d6\u06d7\u06e4\u06e5\u06e4\u06d7\u06e5\u06ec\u06e7\u06e7\u06e6\u06e7\u06eb\u06e6\u06e1\u06e4\u06d8\u06d7\u06e6\u06e0\u06d9\u06df\u06d7\u06e6\u06e7\u06d8\u06eb\u06da\u06dc\u06e4\u06e6\u06eb\u06d7\u06e6\u06e5\u06d8"

    :goto_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v4, v3

    sparse-switch v4, :sswitch_data_4

    goto :goto_5

    :sswitch_c
    const-string v1, "\u06da\u06db\u06e5\u06e0\u06e5\u06eb\u06e8\u06e7\u06da\u06e6\u06df\u06e8\u06d8\u06eb\u06d8\u06e8\u06d8\u06eb\u06ec\u06e5\u06e8\u06ec\u06e2\u06d9\u06e6\u06d8\u06eb\u06e1\u06e8\u06db\u06df\u06d6\u06d8\u06d9\u06db\u06e1\u06d9\u06d8\u06e2\u06db\u06e0\u06d6\u06d8\u06e0\u06d6\u06e2\u06dc"

    goto :goto_5

    :sswitch_d
    const-string v1, "\u06e1\u06e6\u06d6\u06d8\u06d7\u06d7\u06d8\u06d8\u06d7\u06df\u06d6\u06e6\u06db\u06e6\u06d8\u06db\u06df\u06e6\u06d8\u06d6\u06eb\u06e8\u06d8\u06e0\u06e2\u06e2\u06ec\u06e2\u06e4\u06dc\u06db\u06e8\u06db\u06e1\u06e5\u06d8\u06d6\u06d8\u06d8\u06d8\u06e5\u06d6\u06e5\u06da\u06e1\u06e0\u06e4\u06e6\u06e4\u06e0\u06dc\u06e1\u06d8\u06d9\u06e7\u06e4\u06ec\u06e6\u06ec\u06da\u06d6\u06e2\u06da\u06d9\u06d9\u06e6\u06e6\u06db\u06db\u06e6\u06ec"

    goto :goto_4

    :sswitch_e
    const-string v1, "\u06e5\u06e0\u06d6\u06d8\u06d6\u06d9\u06e1\u06d8\u06eb\u06d6\u06e8\u06e5\u06df\u06df\u06df\u06d8\u06d6\u06d8\u06e4\u06e5\u06e8\u06db\u06e4\u06d8\u06d8\u06eb\u06e5\u06d8\u06d9\u06df\u06e1\u06d8\u06e1\u06df\u06e8\u06e0\u06da\u06e4\u06e4\u06e1\u06d6\u06d8\u06d8\u06d6\u06d6\u06e0\u06e1\u06dc\u06e0\u06d8\u06d7\u06e0\u06e2\u06e1\u06ec\u06e8\u06d6\u06db\u06d6\u06d7\u06df\u06d8\u06eb\u06e4\u06e8\u06dc\u06d8\u06e1\u06e6\u06e0\u06df\u06e0\u06e1\u06eb\u06d8\u06d7\u06d8\u06e8\u06e1\u06d8"

    goto :goto_5

    :sswitch_f
    const v4, 0x781f7ef8

    const-string v1, "\u06dc\u06d6\u06e8\u06d8\u06e2\u06e0\u06e4\u06e4\u06d8\u06e1\u06e0\u06e0\u06ec\u06d8\u06e2\u06d9\u06df\u06df\u06eb\u06d8\u06e1\u06d8\u06e5\u06e0\u06d6\u06d8\u06e4\u06dc\u06db\u06da\u06e5\u06ec\u06d7\u06e1\u06dc\u06d8\u06d7\u06db\u06e5\u06d8\u06e7\u06e4\u06e6\u06d7\u06e4\u06e1\u06d8\u06e1\u06e0"

    :goto_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v5

    xor-int/2addr v5, v4

    sparse-switch v5, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    invoke-static {}, L۟/m;->ۥ()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "\u06df\u06df\u06da\u06eb\u06e7\u06da\u06da\u06e2\u06df\u06d7\u06d8\u06e7\u06d8\u06db\u06dc\u06d8\u06da\u06df\u06ec\u06e0\u06e7\u06e8\u06e6\u06e2\u06da\u06d6\u06d7\u06dc\u06eb\u06e8\u06eb\u06e7\u06ec\u06e8\u06d8\u06d7\u06d8\u06dc\u06d7\u06e7\u06da\u06d6\u06e6\u06d6\u06d8\u06da\u06ec\u06e6\u06d7\u06d6\u06e4\u06e4\u06e1\u06e5\u06d8\u06e0\u06e2\u06eb\u06e1\u06df\u06e0\u06e4\u06d6\u06e6\u06d8\u06e4\u06eb\u06da\u06d8\u06eb\u06d8\u06dc\u06d8\u06e8\u06e4\u06e2"

    goto :goto_6

    :cond_1
    const-string v1, "\u06d8\u06e2\u06e8\u06d8\u06e1\u06d7\u06e8\u06e1\u06dc\u06e1\u06d8\u06e8\u06e6\u06d6\u06d8\u06e0\u06e6\u06dc\u06da\u06d7\u06eb\u06db\u06dc\u06d8\u06d6\u06ec\u06e6\u06e7\u06e2\u06dc\u06df\u06eb\u06df\u06dc\u06eb\u06e6\u06e1\u06df\u06eb\u06e0\u06dc\u06e4\u06db\u06e0\u06dc\u06d8\u06ec\u06e0\u06dc\u06e1\u06e2\u06e6\u06d8\u06db\u06da\u06e5\u06d8\u06e5\u06e7\u06d9\u06e4\u06eb\u06e0\u06e5\u06e0\u06df\u06dc\u06e2\u06eb\u06eb\u06e6\u06da\u06eb\u06da\u06db\u06d8\u06e6\u06df\u06e2\u06e6\u06e7\u06d8\u06e2\u06e8\u06e7\u06eb\u06db\u06d7"

    goto :goto_6

    :sswitch_11
    const-string v1, "\u06e7\u06db\u06e5\u06e0\u06e8\u06d6\u06d8\u06d9\u06e7\u06da\u06ec\u06da\u06ec\u06e7\u06e1\u06db\u06df\u06e6\u06e7\u06d8\u06e8\u06d9\u06e6\u06d8\u06e7\u06dc\u06dc\u06d8\u06db\u06db\u06dc\u06d8\u06ec\u06d9\u06d8\u06d8\u06e8\u06d7\u06df\u06e2\u06e5\u06ec\u06ec\u06e8\u06eb\u06d8\u06db\u06d9\u06df\u06e5\u06ec\u06e4\u06d8\u06e5\u06ec\u06e8\u06d8\u06d6\u06e5\u06da\u06ec\u06e8\u06e1\u06d8\u06eb\u06e2\u06e6\u06d8\u06e8\u06e6\u06e2\u06e2\u06e6\u06e6\u06d8\u06e1\u06e2\u06d7\u06ec\u06eb"

    goto :goto_6

    :sswitch_12
    const-string v1, "\u06e7\u06e8\u06d6\u06d8\u06d9\u06e0\u06e5\u06d8\u06e1\u06e2\u06d6\u06df\u06d9\u06dc\u06e4\u06ec\u06df\u06df\u06d9\u06dc\u06d8\u06e5\u06e1\u06d6\u06d8\u06ec\u06e5\u06d7\u06df\u06e4\u06ec\u06df\u06d9\u06e8\u06db\u06e6\u06e8\u06e6\u06e1\u06e1\u06d8\u06e6\u06eb\u06e5\u06d8\u06e5\u06d9\u06e1"

    goto :goto_5

    :sswitch_13
    const-string v1, "\u06d7\u06e8\u06e6\u06d8\u06e5\u06d8\u06d8\u06d8\u06e7\u06d7\u06d7\u06eb\u06e1\u06d8\u06e0\u06e1\u06e7\u06d8\u06d9\u06d9\u06e6\u06d8\u06da\u06d6\u06d7\u06d6\u06e4\u06dc\u06d8\u06df\u06e7\u06e8\u06d8\u06d7\u06d6\u06e6\u06d8\u06e1\u06eb\u06ec\u06df\u06e8\u06e5\u06d8\u06e8\u06d9\u06e5\u06e8\u06da\u06e6\u06e6\u06eb\u06df\u06e2\u06eb\u06e5\u06e0\u06db\u06df\u06e0\u06ec\u06da\u06d8\u06e6\u06d8\u06da\u06e6\u06d8\u06d8\u06d8\u06d8\u06d8\u06e5\u06e6\u06e1\u06d8\u06e8\u06df\u06e6\u06d8\u06e0\u06e4\u06e1\u06d8\u06e4\u06eb\u06e4\u06da\u06da\u06dc\u06d8\u06d8\u06d6\u06d8"
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :sswitch_14
    const-string v1, "\u06e1\u06e2\u06e8\u06d8\u06e2\u06e2\u06e6\u06da\u06dc\u06e7\u06e8\u06d8\u06eb\u06dc\u06d6\u06e6\u06d8\u06e2\u06d7\u06e5\u06e6\u06d8\u06e6\u06d8\u06e5\u06d6\u06d6\u06e1\u06db\u06d6\u06df\u06dc\u06e8\u06d8\u06e6\u06e0\u06d6\u06da\u06e4\u06d6\u06eb\u06e2\u06e8\u06d8\u06da\u06e6\u06d6\u06e2\u06eb\u06e6\u06d8\u06e6\u06e7\u06e1\u06d8\u06dc\u06e0\u06e1\u06eb\u06d7\u06da\u06d8\u06e7\u06df\u06e1\u06eb\u06e1\u06e5\u06d7\u06ec\u06e6\u06e8\u06d6\u06d8\u06da\u06db\u06e5\u06da\u06e2"

    goto :goto_4

    :sswitch_15
    new-instance v1, L۟/z7$b;

    invoke-direct {v1, v0}, L۟/z7$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, L۟/z7$b;->ۥ()L۟/z7;

    move-result-object v1

    invoke-static {v1}, L۟/z7;->ۥ۟۠(L۟/z7;)V

    iget-object v1, p0, L۟/k8$b;->ۥ:L۟/k8;

    sget-object v2, L۟/q;->ۥ۟:L۟/kb;

    invoke-static {v0}, L۟/q$c;->ۥ۟۠(Landroid/app/Application;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v2}, L۟/q;->ۥ۟۠(Landroid/app/Application;Ljava/lang/String;)V

    invoke-static {v0}, L۟/nb;->ۥ۟(Landroid/app/Application;)V

    iget-object v0, p0, L۟/k8$b;->ۥ:L۟/k8;

    invoke-static {v0}, L۟/k8;->ۥ۟ۢ(L۟/k8;)V

    :goto_7
    :sswitch_16
    return-void

    :catch_0
    move-exception v1

    goto/16 :goto_3

    :catch_1
    move-exception v0

    goto :goto_7

    nop

    :array_0
    .array-data 1
        0x66t
        -0x37t
        0x3et
        0x77t
        0x1at
    .end array-data

    nop

    :array_1
    .array-data 1
        0x16t
        -0x58t
        0x4ct
        0x16t
        0x77t
        -0x10t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x30t
        -0x40t
        -0x6dt
        0xft
        0x6t
        -0x70t
        -0x21t
        -0x25t
        -0x6ft
        0xct
        0x52t
        -0x2dt
        -0x24t
        -0x30t
        -0x21t
        0x0t
        0x47t
        -0x80t
        -0x36t
        -0x6bt
        -0x75t
        0xct
        0x6t
        -0x63t
        -0x2ft
        -0x25t
        -0x2et
        0xdt
        0x53t
        -0x61t
        -0x2et
        -0x6bt
        -0x75t
        0x1at
        0x56t
        -0x6at
        -0x62t
        -0x2ct
        -0x6ft
        0x7t
        0x54t
        -0x64t
        -0x29t
        -0x2ft
        -0x2ft
        0x2t
        0x56t
        -0x7dt
        -0x70t
        -0xct
        -0x71t
        0x13t
        0x4at
        -0x66t
        -0x23t
        -0x2ct
        -0x75t
        0xat
        0x49t
        -0x63t
    .end array-data

    :array_3
    .array-data 1
        -0x42t
        -0x4bt
        -0x1t
        0x63t
        0x26t
        -0xdt
    .end array-data

    nop

    :sswitch_data_0
    .sparse-switch
        -0x69f20ba5 -> :sswitch_9
        -0x243659cf -> :sswitch_a
        -0x1c1473e7 -> :sswitch_16
        0x3351a63d -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x6666a30f -> :sswitch_8
        0x13bdd24a -> :sswitch_3
        0x33a8f894 -> :sswitch_1
        0x41b48f99 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        -0x739e1fd0 -> :sswitch_6
        -0x5edfbd6e -> :sswitch_5
        -0x56ddf57f -> :sswitch_4
        0x6bf26a94 -> :sswitch_2
    .end sparse-switch

    :array_4
    .array-data 1
        0x6et
        -0xet
        0x4at
        -0x5et
        0xbt
        -0xct
        0x74t
        -0xbt
        0x46t
        -0x1et
        0x1ct
        -0x4ft
        0x7ft
        -0x8t
        0x43t
        -0x12t
        0x17t
        -0x10t
        0x66t
        -0xbt
        0x42t
        -0x20t
        0x8t
        -0x6t
        0x7ft
    .end array-data

    nop

    :array_5
    .array-data 1
        0xdt
        -0x63t
        0x27t
        -0x74t
        0x78t
        -0x61t
    .end array-data

    nop

    :array_6
    .array-data 1
        0x73t
        -0x38t
        0x5ft
        0x57t
        0x2at
        -0x5dt
        0x7et
        -0x3dt
        0x51t
        0x15t
        0x31t
        -0x4dt
        0x74t
        -0x77t
        0x46t
        0x1ct
        0x30t
        -0x5et
        0x74t
        -0x3at
        0x46t
        0x18t
        0x70t
        -0x6et
        0x71t
        -0x35t
        0x59t
        0x10t
        0x30t
        -0x5ft
        0x54t
        -0x3at
        0x46t
        0x18t
        0xdt
        -0x7et
        0x5bt
    .end array-data

    nop

    :array_7
    .array-data 1
        0x10t
        -0x59t
        0x32t
        0x79t
        0x5et
        -0x3at
    .end array-data

    nop

    :sswitch_data_3
    .sparse-switch
        -0x718383d5 -> :sswitch_b
        0x102267ca -> :sswitch_16
        0x4b20f678 -> :sswitch_15
        0x5e141a83 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        -0x6ff03fa6 -> :sswitch_f
        -0x395f96aa -> :sswitch_d
        -0x1cb2942c -> :sswitch_13
        -0x18299741 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        -0x7d1501f3 -> :sswitch_e
        -0x23aea8bc -> :sswitch_10
        0x26fc2b87 -> :sswitch_11
        0x4ca5b162 -> :sswitch_12
    .end sparse-switch
.end method
