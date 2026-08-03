.class public final Lbz;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:LQx;

.field public c:[[I

.field public d:[LQx;

.field public e:Laz;

.field public f:Laz;

.field public g:Laz;

.field public h:Laz;


# direct methods
.method public constructor <init>(LQx;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Lbz;->b()V

    sget-object v0, Landroid/util/StateSet;->WILD_CARD:[I

    invoke-virtual {p0, v0, p1}, Lbz;->a([ILQx;)V

    return-void
.end method


# virtual methods
.method public final a([ILQx;)V
    .locals 5

    iget v0, p0, Lbz;->a:I

    if-eqz v0, :cond_0

    array-length v1, p1

    if-nez v1, :cond_1

    :cond_0
    iput-object p2, p0, Lbz;->b:LQx;

    :cond_1
    iget-object v1, p0, Lbz;->c:[[I

    array-length v2, v1

    if-lt v0, v2, :cond_2

    add-int/lit8 v2, v0, 0xa

    new-array v3, v2, [[I

    const/4 v4, 0x0

    invoke-static {v1, v4, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v3, p0, Lbz;->c:[[I

    new-array v1, v2, [LQx;

    iget-object v2, p0, Lbz;->d:[LQx;

    invoke-static {v2, v4, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v1, p0, Lbz;->d:[LQx;

    :cond_2
    iget-object v0, p0, Lbz;->c:[[I

    iget v1, p0, Lbz;->a:I

    aput-object p1, v0, v1

    iget-object p1, p0, Lbz;->d:[LQx;

    aput-object p2, p1, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lbz;->a:I

    return-void
.end method

.method public final b()V
    .locals 2

    new-instance v0, LQx;

    invoke-direct {v0}, LQx;-><init>()V

    iput-object v0, p0, Lbz;->b:LQx;

    const/16 v0, 0xa

    new-array v1, v0, [[I

    iput-object v1, p0, Lbz;->c:[[I

    new-array v0, v0, [LQx;

    iput-object v0, p0, Lbz;->d:[LQx;

    return-void
.end method
