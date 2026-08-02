.class public final Lco;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lg92;


# instance fields
.field public final synthetic a:I

.field public final b:Lxa0;


# direct methods
.method public synthetic constructor <init>(Lxa0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lco;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lco;->b:Lxa0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILov1;)Ld92;
    .locals 6

    .line 1
    iget v0, p0, Lco;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 7
    .line 8
    new-instance v1, Lb5;

    .line 9
    .line 10
    iget-object v0, p0, Lco;->b:Lxa0;

    .line 11
    .line 12
    iget-object p0, v0, Lxa0;->d:Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v2, v0, Lxa0;->c:Ltd1;

    .line 15
    .line 16
    invoke-direct {v1, p1, p0, v2}, Lb5;-><init>(Landroid/os/ParcelFileDescriptor;Ljava/util/ArrayList;Ltd1;)V

    .line 17
    .line 18
    .line 19
    sget-object v5, Lxa0;->j:Leb;

    .line 20
    .line 21
    move v2, p2

    .line 22
    move v3, p3

    .line 23
    move-object v4, p4

    .line 24
    invoke-virtual/range {v0 .. v5}, Lxa0;->a(Lb5;IILov1;Lwa0;)Lal;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    move v2, p2

    .line 30
    move v3, p3

    .line 31
    move-object v4, p4

    .line 32
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    new-instance v1, Lb5;

    .line 35
    .line 36
    iget-object v0, p0, Lco;->b:Lxa0;

    .line 37
    .line 38
    iget-object p0, v0, Lxa0;->d:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object p2, v0, Lxa0;->c:Ltd1;

    .line 41
    .line 42
    const/16 p3, 0xe

    .line 43
    .line 44
    invoke-direct {v1, p1, p0, p2, p3}, Lb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    sget-object v5, Lxa0;->j:Leb;

    .line 48
    .line 49
    invoke-virtual/range {v0 .. v5}, Lxa0;->a(Lb5;IILov1;Lwa0;)Lal;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;Lov1;)Z
    .locals 2

    .line 1
    iget p0, p0, Lco;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    .line 7
    .line 8
    sget-object p0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 9
    .line 10
    const-string p2, "HUAWEI"

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    const-string p2, "HONOR"

    .line 19
    .line 20
    invoke-virtual {p2, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getStatSize()J

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    const-wide/32 v0, 0x20000000

    .line 31
    .line 32
    .line 33
    cmp-long p0, p0, v0

    .line 34
    .line 35
    if-gtz p0, :cond_2

    .line 36
    .line 37
    :cond_1
    const-string p0, "robolectric"

    .line 38
    .line 39
    sget-object p1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_2

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 p0, 0x0

    .line 50
    :goto_0
    return p0

    .line 51
    :pswitch_0
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 52
    .line 53
    const/4 p0, 0x1

    .line 54
    return p0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
