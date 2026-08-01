.class public final Lhg;
.super Ljava/lang/Object;

# interfaces
.implements Lp20;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lhg;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lhg;->b:Ljava/lang/Object;

    .line 3
    sget-object p1, Ljk;->a:Ljk;

    iput-object p1, p0, Lhg;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Lqh;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lhg;->a:I

    const-string v0, "input"

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lhg;->b:Ljava/lang/Object;

    .line 6
    iput-object p2, p0, Lhg;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, Lhg;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lhk;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lhk;-><init>(Lhg;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lgg;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lgg;-><init>(Lhg;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
