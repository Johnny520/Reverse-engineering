.class public final L۟/n9;
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


# instance fields
.field public final synthetic ۥ:L۟/t9;


# direct methods
.method public constructor <init>(L۟/t9;)V
    .locals 0

    iput-object p1, p0, L۟/n9;->ۥ:L۟/t9;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

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
    iget-object v0, p0, L۟/n9;->ۥ:L۟/t9;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    const/high16 v2, 0x423c0000    # 47.0f

    .line 26
    .line 27
    invoke-static {v1, v2}, L۟/c4;->ۥۣ۟(IF)F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    float-to-int v1, v1

    .line 32
    iput v1, v0, L۟/t9;->ۥ۟۟:I

    .line 33
    .line 34
    iget-object v0, p0, L۟/n9;->ۥ:L۟/t9;

    .line 35
    .line 36
    invoke-static {v0, p1}, L۟/t9;->ۥ۟۟(L۟/t9;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 37
    .line 38
    .line 39
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 40
    .line 41
    return-object p1

    .line 42
    nop

    .line 43
    :array_0
    .array-data 1
        -0x29t
        -0x41t
        0x1t
        -0x1ft
        -0x4bt
    .end array-data

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    nop

    .line 51
    :array_1
    .array-data 1
        -0x59t
        -0x22t
        0x73t
        -0x80t
        -0x28t
        0x38t
    .end array-data
.end method
