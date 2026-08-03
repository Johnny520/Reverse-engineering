.class public final L۟/t3;
.super Lde/robv/android/xposed/XC_MethodReplacement;
.source "SourceFile"


# instance fields
.field public final synthetic ۥ:L۟/g3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u06df/g3<",
            "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(L۟/g3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u06df/g3<",
            "-",
            "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, L۟/t3;->ۥ:L۟/g3;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodReplacement;-><init>()V

    return-void
.end method


# virtual methods
.method public final replaceHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x5

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, L۟/t3;->ۥ:L۟/g3;

    invoke-static {v0, p1}, L۟/s3;->ۥ(L۟/g3;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v0, L۟/b0;->ۥ:Ljava/lang/StringBuilder;

    invoke-static {p1}, L۟/b0$a;->ۥ(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1

    :array_0
    .array-data 1
        0x4t
        0x1dt
        -0x18t
        0x3at
        0x31t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x74t
        0x7ct
        -0x66t
        0x5bt
        0x5ct
        -0x16t
    .end array-data
.end method
