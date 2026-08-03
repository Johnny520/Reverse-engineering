.class public final L۟/n7;
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
.field public static final ۥ:L۟/n7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/n7;

    invoke-direct {v0}, L۟/n7;-><init>()V

    sput-object v0, L۟/n7;->ۥ:L۟/n7;

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
    const/4 v0, 0x2

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
    invoke-static {p1}, L۟/m7;->ۥ۟۠(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

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
        0x70t
        0x73t
    .end array-data

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    nop

    .line 35
    :array_1
    .array-data 1
        0x19t
        0x7t
        0x36t
        0x29t
        0x4dt
        0x39t
    .end array-data
.end method
