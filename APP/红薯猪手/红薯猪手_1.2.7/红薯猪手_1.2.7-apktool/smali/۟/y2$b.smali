.class public final L۟/y2$b;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/y2;->ۥ(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/y2;


# direct methods
.method public constructor <init>(L۟/y2;)V
    .locals 0

    iput-object p1, p0, L۟/y2$b;->ۥ:L۟/y2;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    sget-boolean v0, L۟/y2;->ۥ:Z

    invoke-static {}, L۟/y2$a;->ۥ۟()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    const/16 v3, 0xf

    new-array v3, v3, [B

    fill-array-data v3, :array_2

    new-array v4, v1, [B

    fill-array-data v4, :array_3

    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/16 v0, 0xa

    new-array v0, v0, [B

    fill-array-data v0, :array_4

    new-array v3, v1, [B

    fill-array-data v3, :array_5

    invoke-static {v0, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, L۟/k8;->ۥۣ۟:L۟/k;

    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    move-result-object v0

    iget-object v0, v0, L۟/k;->ۥۢ۟:Ljava/lang/String;

    invoke-static {p1, v0}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, ""

    if-eqz p1, :cond_1

    const/16 v3, 0x8

    new-array v3, v3, [B

    fill-array-data v3, :array_6

    new-array v4, v1, [B

    fill-array-data v4, :array_7

    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, L۟/r3;->ۥ۟ۦ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    if-lez v3, :cond_2

    move v2, v4

    :cond_2
    if-eqz v2, :cond_4

    iget-object v1, p0, L۟/y2$b;->ۥ:L۟/y2;

    invoke-static {v1, p1}, L۟/y2;->ۥ۟۟(L۟/y2;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    move-object v0, p1

    :goto_1
    invoke-static {}, L۟/y2$a;->ۥۣ۟()V

    sget p1, L۟/o;->ۥ:I

    invoke-static {v0}, L۟/o;->ۥ۟۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, L۟/y2$a;->ۥ۟ۢ(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    sget p1, L۟/o;->ۥ:I

    const/16 p1, 0x2a

    new-array p1, p1, [B

    fill-array-data p1, :array_8

    new-array v0, v1, [B

    fill-array-data v0, :array_9

    invoke-static {p1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, L۟/o;->ۥ۠(Ljava/lang/String;)V

    :goto_2
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {p1}, L۟/r3;->ۥ۠ۥ(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    return-object p1

    nop

    :array_0
    .array-data 1
        -0x4ft
        -0x28t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x28t
        -0x54t
        0x7et
        -0x10t
        -0x78t
        0x12t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x78t
        -0x2et
        -0x18t
        0x5t
        0x6dt
        0x62t
        -0x67t
        -0x2et
        -0x19t
        0x4t
        0x77t
        0x66t
        -0x67t
        -0x21t
        -0x3t
    .end array-data

    :array_3
    .array-data 1
        -0x24t
        -0x75t
        -0x48t
        0x40t
        0x32t
        0x2at
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x33t
        0x18t
        -0x21t
        -0x6ft
        0x8t
        -0x65t
        -0x2dt
        0x15t
        -0x2bt
        -0x6at
    .end array-data

    nop

    :array_5
    .array-data 1
        -0x47t
        0x70t
        -0x4at
        -0x1et
        0x47t
        -0x7t
    .end array-data

    nop

    :array_6
    .array-data 1
        0x1ct
        0x13t
        0x52t
        -0x5t
        0x74t
        0x6et
        0x1ft
        0x1ft
    .end array-data

    :array_7
    .array-data 1
        0x72t
        0x7at
        0x31t
        -0x70t
        0x1at
        0xft
    .end array-data

    nop

    :array_8
    .array-data 1
        -0x51t
        0x2ct
        0x69t
        -0xat
        0x6at
        -0x10t
        -0x5et
        0x31t
        0x70t
        -0xbt
        0x5bt
        -0xct
        -0x51t
        0x2at
        0x46t
        -0x5t
        0x54t
        -0xbt
        -0x5bt
        0x32t
        0x7bt
        -0x5t
        0x6et
        -0x19t
        -0x51t
        0x1t
        0x61t
        -0xct
        0x74t
        -0x8t
        -0x54t
        0x6t
        0x40t
        -0xat
        0x70t
        -0x23t
        -0x52t
        0x36t
        0x4dt
        -0xct
        0x49t
        -0x16t
    .end array-data

    nop

    :array_9
    .array-data 1
        0x4at
        -0x72t
        -0x9t
        0x13t
        -0x20t
        0x50t
    .end array-data
.end method
