.class public final Lie;
.super Lgq;

# interfaces
.implements Lym;


# static fields
.field public static final c:Lie;

.field public static final d:Lie;

.field public static final e:Lie;

.field public static final f:Lie;

.field public static final g:Lie;


# instance fields
.field public final synthetic b:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lie;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lie;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lie;->c:Lie;

    .line 9
    .line 10
    new-instance v0, Lie;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Lie;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lie;->d:Lie;

    .line 17
    .line 18
    new-instance v0, Lie;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, Lie;-><init>(II)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lie;->e:Lie;

    .line 25
    .line 26
    new-instance v0, Lie;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v1, v2}, Lie;-><init>(II)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lie;->f:Lie;

    .line 33
    .line 34
    new-instance v0, Lie;

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    invoke-direct {v0, v1, v2}, Lie;-><init>(II)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lie;->g:Lie;

    .line 41
    .line 42
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lie;->b:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lgq;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lie;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lhe;

    .line 7
    .line 8
    check-cast p2, Lfe;

    .line 9
    .line 10
    invoke-interface {p1, p2}, Lhe;->i(Lhe;)Lhe;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    check-cast p1, Lb70;

    .line 16
    .line 17
    check-cast p2, Lfe;

    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_1
    invoke-static {p1}, Lg40;->m(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    check-cast p2, Lfe;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return-object p1

    .line 27
    :pswitch_2
    check-cast p2, Lfe;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    check-cast p2, Lfe;

    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_4
    check-cast p1, Lhe;

    .line 39
    .line 40
    check-cast p2, Lfe;

    .line 41
    .line 42
    invoke-interface {p1, p2}, Lhe;->i(Lhe;)Lhe;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
