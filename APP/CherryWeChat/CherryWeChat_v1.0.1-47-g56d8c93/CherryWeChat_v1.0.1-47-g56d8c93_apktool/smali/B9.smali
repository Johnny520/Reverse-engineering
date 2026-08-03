.class public final LB9;
.super LBn;
.source ""

# interfaces
.implements Lfj;


# static fields
.field public static final c:LB9;

.field public static final d:LB9;

.field public static final e:LB9;


# instance fields
.field public final synthetic b:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, LB9;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LB9;-><init>(II)V

    sput-object v0, LB9;->c:LB9;

    new-instance v0, LB9;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LB9;-><init>(II)V

    sput-object v0, LB9;->d:LB9;

    new-instance v0, LB9;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LB9;-><init>(II)V

    sput-object v0, LB9;->e:LB9;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, LB9;->b:I

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LB9;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Class;

    invoke-static {p1}, LFd;->c(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, LFd;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, LC9;

    invoke-virtual {p1}, LC9;->g()LCd;

    move-result-object p1

    iget-object p1, p1, LCd;->a:Ljava/lang/String;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
