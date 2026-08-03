.class public final L۟/s3$a;
.super Lde/robv/android/xposed/XC_MethodReplacement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/s3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodReplacement;-><init>()V

    return-void
.end method


# virtual methods
.method public final replaceHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    const/16 v1, 0x3d

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v3, v2, [B

    fill-array-data v3, :array_1

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/reflect/Method;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v3, 0x0

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const/4 v1, 0x5

    new-array v1, v1, [B

    fill-array-data v1, :array_2

    new-array v2, v2, [B

    fill-array-data v2, :array_3

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-static {}, L۟/b6;->ۥ۟ۤ()V

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :sswitch_1
    const/4 v1, 0x7

    new-array v1, v1, [B

    fill-array-data v1, :array_4

    new-array v2, v2, [B

    fill-array-data v2, :array_5

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {}, L۟/b6;->ۥ۟ۤ()V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :sswitch_2
    const/4 v1, 0x4

    new-array v1, v1, [B

    fill-array-data v1, :array_6

    new-array v2, v2, [B

    fill-array-data v2, :array_7

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {}, L۟/b6;->ۥ۟ۤ()V

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :sswitch_3
    const/4 v1, 0x3

    new-array v1, v1, [B

    fill-array-data v1, :array_8

    new-array v2, v2, [B

    fill-array-data v2, :array_9

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {}, L۟/b6;->ۥ۟ۤ()V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :sswitch_4
    new-array v1, v2, [B

    fill-array-data v1, :array_a

    new-array v2, v2, [B

    fill-array-data v2, :array_b

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {}, L۟/b6;->ۥ۟ۤ()V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :goto_1
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_4
        0x197ef -> :sswitch_3
        0x32c67c -> :sswitch_2
        0x3db6c28 -> :sswitch_1
        0x5d0225c -> :sswitch_0
    .end sparse-switch

    :array_0
    .array-data 1
        0x43t
        0x6t
        -0x30t
        -0x5at
        0x52t
        -0x25t
        0x4ct
        0x1dt
        -0x2et
        -0x5bt
        0x6t
        -0x68t
        0x4ft
        0x16t
        -0x64t
        -0x57t
        0x13t
        -0x35t
        0x59t
        0x53t
        -0x38t
        -0x5bt
        0x52t
        -0x2at
        0x42t
        0x1dt
        -0x6ft
        -0x5ct
        0x7t
        -0x2ct
        0x41t
        0x53t
        -0x38t
        -0x4dt
        0x2t
        -0x23t
        0xdt
        0x19t
        -0x23t
        -0x44t
        0x13t
        -0x6at
        0x41t
        0x12t
        -0x2et
        -0x53t
        0x5ct
        -0x36t
        0x48t
        0x15t
        -0x30t
        -0x51t
        0x11t
        -0x34t
        0x3t
        0x3et
        -0x27t
        -0x42t
        0x1at
        -0x29t
        0x49t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x2dt
        0x73t
        -0x44t
        -0x36t
        0x72t
        -0x48t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x2bt
        0x7at
        -0x20t
        -0x66t
        0x69t
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x4dt
        0x16t
        -0x71t
        -0x5t
        0x1dt
        0x62t
    .end array-data

    nop

    :array_4
    .array-data 1
        0x6dt
        0x16t
        0x7ct
        -0x5t
        -0x2ft
        0x8t
        0x61t
    .end array-data

    :array_5
    .array-data 1
        0xft
        0x79t
        0x13t
        -0x69t
        -0x4ct
        0x69t
    .end array-data

    nop

    :array_6
    .array-data 1
        0x7et
        -0x40t
        -0xat
        0x76t
    .end array-data

    :array_7
    .array-data 1
        0x12t
        -0x51t
        -0x68t
        0x11t
        0x39t
        0xet
    .end array-data

    nop

    :array_8
    .array-data 1
        -0x13t
        0xdt
        0x34t
    .end array-data

    :array_9
    .array-data 1
        -0x7ct
        0x63t
        0x40t
        -0x45t
        -0x7dt
        0x30t
    .end array-data

    nop

    :array_a
    .array-data 1
        0x15t
        -0x4et
        -0x63t
        0x1t
        -0x73t
        -0x6bt
    .end array-data

    nop

    :array_b
    .array-data 1
        0x71t
        -0x23t
        -0x18t
        0x63t
        -0x1ft
        -0x10t
    .end array-data
.end method
