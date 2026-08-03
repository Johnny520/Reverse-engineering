.class public final LNB;
.super LJB;
.source ""


# instance fields
.field public final synthetic a:I

.field public b:LIB;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LNB;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LIB;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LNB;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LNB;->b:LIB;

    return-void
.end method


# virtual methods
.method public a(LIB;)V
    .locals 1

    iget p1, p0, LNB;->a:I

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object p1, p0, LNB;->b:LIB;

    check-cast p1, Ld5;

    iget-boolean v0, p1, Ld5;->D:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, LIB;->G()V

    const/4 v0, 0x1

    iput-boolean v0, p1, Ld5;->D:Z

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(LIB;)V
    .locals 2

    iget v0, p0, LNB;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LNB;->b:LIB;

    check-cast v0, Ld5;

    iget v1, v0, Ld5;->C:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Ld5;->C:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Ld5;->D:Z

    invoke-virtual {v0}, LIB;->m()V

    :cond_0
    invoke-virtual {p1, p0}, LIB;->x(LHB;)LIB;

    return-void

    :pswitch_0
    iget-object v0, p0, LNB;->b:LIB;

    invoke-virtual {v0}, LIB;->z()V

    invoke-virtual {p1, p0}, LIB;->x(LHB;)LIB;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
