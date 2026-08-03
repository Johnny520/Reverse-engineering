.class public final L۟/ka;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ:L۟/ka;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/ka;

    invoke-direct {v0}, L۟/ka;-><init>()V

    sput-object v0, L۟/ka;->ۥ:L۟/ka;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x6

    .line 10
    new-array v1, v1, [B

    .line 11
    .line 12
    fill-array-data v1, :array_1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, L۟/na;->ۥ۟۟(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :array_0
    .array-data 1
        -0x11t
        0x2bt
        -0x71t
        -0x28t
        -0x49t
    .end array-data

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    nop

    .line 37
    :array_1
    .array-data 1
        -0x61t
        0x4at
        -0x3t
        -0x47t
        -0x26t
        -0xbt
    .end array-data
.end method
