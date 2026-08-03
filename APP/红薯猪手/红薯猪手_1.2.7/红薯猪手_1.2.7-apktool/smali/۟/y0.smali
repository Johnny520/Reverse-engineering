.class public final L۟/y0;
.super L۟/za;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/za;-><init>()V

    return-void
.end method

.method public static ۥ۟۟(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;L۟/y0;)V
    .locals 3

    const/4 v0, 0x6

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    new-array v2, v0, [B

    fill-array-data v2, :array_1

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v1, v0, [B

    fill-array-data v1, :array_2

    new-array v2, v0, [B

    fill-array-data v2, :array_3

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/16 p1, 0xa

    new-array p1, p1, [B

    fill-array-data p1, :array_4

    new-array v1, v0, [B

    fill-array-data v1, :array_5

    invoke-static {p1, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, L۟/k8;->ۥۣ۟:L۟/k;

    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    move-result-object p1

    iget-object p1, p1, L۟/k;->ۥۡۦ:Ljava/lang/String;

    invoke-static {p0, p1}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    const/16 p1, 0x8

    new-array p1, p1, [B

    fill-array-data p1, :array_6

    new-array v0, v0, [B

    fill-array-data v0, :array_7

    invoke-static {p1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {}, L۟/l3;->ۥ۟()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1, p0}, L۟/y0;->ۥ۟ۡ(Landroid/content/Context;Ljava/lang/Object;)V

    return-void

    :array_0
    .array-data 1
        0x3dt
        -0x42t
        -0x4at
        0x1et
        0xat
        0x70t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x19t
        -0x32t
        -0x29t
        0x6ct
        0x6bt
        0x1dt
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x37t
        0x1t
        -0x4ct
        -0x71t
        -0x34t
        -0x76t
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x43t
        0x69t
        -0x23t
        -0x4t
        -0x18t
        -0x46t
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x13t
        -0x59t
        0x78t
        -0x4dt
        -0x20t
        -0x55t
        -0xdt
        -0x56t
        0x72t
        -0x4ct
    .end array-data

    nop

    :array_5
    .array-data 1
        -0x67t
        -0x31t
        0x11t
        -0x40t
        -0x51t
        -0x37t
    .end array-data

    nop

    :array_6
    .array-data 1
        0x18t
        -0xft
        0x55t
        -0x12t
        -0x6at
        0x3bt
        0x13t
        -0x6t
    .end array-data

    :array_7
    .array-data 1
        0x76t
        -0x62t
        0x21t
        -0x75t
        -0x30t
        0x5et
    .end array-data
.end method

.method public static ۥ۟۠(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;L۟/y0;)V
    .locals 3

    const/4 v0, 0x6

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    new-array v2, v0, [B

    fill-array-data v2, :array_1

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v1, v0, [B

    fill-array-data v1, :array_2

    new-array v2, v0, [B

    fill-array-data v2, :array_3

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/16 p1, 0xa

    new-array p1, p1, [B

    fill-array-data p1, :array_4

    new-array v1, v0, [B

    fill-array-data v1, :array_5

    invoke-static {p1, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, L۟/k8;->ۥۣ۟:L۟/k;

    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    move-result-object p1

    iget-object p1, p1, L۟/k;->ۥۡۦ:Ljava/lang/String;

    invoke-static {p0, p1}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    const/16 p1, 0x8

    new-array p1, p1, [B

    fill-array-data p1, :array_6

    new-array v0, v0, [B

    fill-array-data v0, :array_7

    invoke-static {p1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {}, L۟/l3;->ۥ۟()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1, p0}, L۟/y0;->ۥ۟ۡ(Landroid/content/Context;Ljava/lang/Object;)V

    return-void

    :array_0
    .array-data 1
        -0x25t
        0x42t
        -0xat
        -0x4dt
        -0x79t
        -0x72t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x1t
        0x32t
        -0x69t
        -0x3ft
        -0x1at
        -0x1dt
    .end array-data

    nop

    :array_2
    .array-data 1
        0x4ct
        -0x6at
        0x2ft
        -0x23t
        -0x11t
        0x33t
    .end array-data

    nop

    :array_3
    .array-data 1
        0x38t
        -0x2t
        0x46t
        -0x52t
        -0x35t
        0x3t
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x31t
        0x11t
        0xct
        0x4ft
        -0x60t
        -0x4at
        -0x2ft
        0x1ct
        0x6t
        0x48t
    .end array-data

    nop

    :array_5
    .array-data 1
        -0x45t
        0x79t
        0x65t
        0x3ct
        -0x11t
        -0x2ct
    .end array-data

    nop

    :array_6
    .array-data 1
        0x14t
        -0x37t
        -0x7t
        0x1ct
        -0x43t
        0x71t
        0x1ft
        -0x3et
    .end array-data

    :array_7
    .array-data 1
        0x7at
        -0x5at
        -0x73t
        0x79t
        -0x5t
        0x14t
    .end array-data
.end method

.method public static ۥ۟ۡ(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 6

    if-eqz p1, :cond_5

    const/4 v0, 0x5

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {p1, v0}, L۟/r3;->ۥ۟ۦ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v3, ""

    if-nez v0, :cond_0

    move-object v0, v3

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x1

    if-lez v4, :cond_1

    move v4, v5

    goto :goto_0

    :cond_1
    move v4, v2

    :goto_0
    if-eqz v4, :cond_2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    const/4 v4, 0x4

    new-array v4, v4, [B

    fill-array-data v4, :array_2

    new-array v1, v1, [B

    fill-array-data v1, :array_3

    invoke-static {v4, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, L۟/r3;->ۥ۟ۦ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    move-object v3, p1

    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    move v2, v5

    :cond_4
    if-eqz v2, :cond_5

    new-instance v0, L۟/s0;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, L۟/s0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, L۟/ya;->show()V

    :cond_5
    return-void

    nop

    :array_0
    .array-data 1
        0x54t
        -0x60t
        -0x64t
        -0x5t
        -0x1et
    .end array-data

    nop

    :array_1
    .array-data 1
        0x20t
        -0x37t
        -0x18t
        -0x69t
        -0x79t
        0xet
    .end array-data

    nop

    :array_2
    .array-data 1
        0x72t
        0x15t
        -0xct
        -0x31t
    .end array-data

    :array_3
    .array-data 1
        0x16t
        0x70t
        -0x79t
        -0x54t
        -0x1at
        0x14t
    .end array-data
.end method


# virtual methods
.method public final ۥ(Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0xb

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, L۟/c1;->ۥۣ۠:L۟/c1;

    new-instance v0, L۟/y0$a;

    invoke-direct {v0, p0}, L۟/y0$a;-><init>(L۟/y0;)V

    invoke-static {p1, v0}, L۟/e1;->ۥ۟۠(L۟/c1;L۟/f3;)V

    return-void

    nop

    :array_0
    .array-data 1
        -0x38t
        -0x3at
        0x53t
        0x60t
        0x40t
        -0x14t
        -0x35t
        -0x6t
        0x5dt
        0x6et
        0x40t
    .end array-data

    :array_1
    .array-data 1
        -0x48t
        -0x4ct
        0x3ct
        0x3t
        0x25t
        -0x61t
    .end array-data
.end method
