.class public final Ln7/b;
.super Ln7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final b:Ln7/b;

.field public static final c:Ln7/b;

.field public static final d:Ln7/b;

.field public static final e:Ln7/b;

.field public static final f:Ln7/b;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln7/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ln7/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ln7/b;->b:Ln7/b;

    .line 8
    .line 9
    new-instance v0, Ln7/b;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Ln7/b;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ln7/b;->c:Ln7/b;

    .line 16
    .line 17
    new-instance v0, Ln7/b;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Ln7/b;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Ln7/b;->d:Ln7/b;

    .line 24
    .line 25
    new-instance v0, Ln7/b;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Ln7/b;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Ln7/b;->e:Ln7/b;

    .line 32
    .line 33
    new-instance v0, Ln7/b;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, Ln7/b;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Ln7/b;->f:Ln7/b;

    .line 40
    .line 41
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ln7/b;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Ln7/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const-string p1, "@null"

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string p1, "@empty"

    .line 12
    .line 13
    :goto_0
    return-object p1

    .line 14
    :pswitch_0
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :pswitch_1
    const/16 v0, 0x8

    .line 20
    .line 21
    invoke-static {p1, v0}, Ly7/a;->k(II)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :pswitch_2
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :pswitch_3
    if-nez p1, :cond_1

    .line 36
    .line 37
    const-string p1, "false"

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p1, "true"

    .line 41
    .line 42
    :goto_1
    return-object p1

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
