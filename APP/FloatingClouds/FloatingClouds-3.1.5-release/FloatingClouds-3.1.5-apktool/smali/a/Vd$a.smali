.class public final La/Vd$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/Vd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:La/w1;

.field public b:La/w1;

.field public c:La/w1;

.field public d:La/w1;

.field public e:La/w4;

.field public f:La/w4;

.field public g:La/w4;

.field public h:La/w4;

.field public i:La/H5;

.field public j:La/H5;

.field public k:La/H5;

.field public l:La/H5;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La/Ad;

    invoke-direct {v0}, La/Ad;-><init>()V

    iput-object v0, p0, La/Vd$a;->a:La/w1;

    new-instance v0, La/Ad;

    invoke-direct {v0}, La/Ad;-><init>()V

    iput-object v0, p0, La/Vd$a;->b:La/w1;

    new-instance v0, La/Ad;

    invoke-direct {v0}, La/Ad;-><init>()V

    iput-object v0, p0, La/Vd$a;->c:La/w1;

    new-instance v0, La/Ad;

    invoke-direct {v0}, La/Ad;-><init>()V

    iput-object v0, p0, La/Vd$a;->d:La/w1;

    new-instance v0, La/s;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/s;-><init>(F)V

    iput-object v0, p0, La/Vd$a;->e:La/w4;

    new-instance v0, La/s;

    invoke-direct {v0, v1}, La/s;-><init>(F)V

    iput-object v0, p0, La/Vd$a;->f:La/w4;

    new-instance v0, La/s;

    invoke-direct {v0, v1}, La/s;-><init>(F)V

    iput-object v0, p0, La/Vd$a;->g:La/w4;

    new-instance v0, La/s;

    invoke-direct {v0, v1}, La/s;-><init>(F)V

    iput-object v0, p0, La/Vd$a;->h:La/w4;

    new-instance v0, La/H5;

    invoke-direct {v0}, La/H5;-><init>()V

    iput-object v0, p0, La/Vd$a;->i:La/H5;

    new-instance v0, La/H5;

    invoke-direct {v0}, La/H5;-><init>()V

    iput-object v0, p0, La/Vd$a;->j:La/H5;

    new-instance v0, La/H5;

    invoke-direct {v0}, La/H5;-><init>()V

    iput-object v0, p0, La/Vd$a;->k:La/H5;

    new-instance v0, La/H5;

    invoke-direct {v0}, La/H5;-><init>()V

    iput-object v0, p0, La/Vd$a;->l:La/H5;

    return-void
.end method

.method public static b(La/w1;)F
    .locals 2

    instance-of v0, p0, La/Ad;

    const/high16 v1, -0x40800000    # -1.0f

    if-eqz v0, :cond_0

    check-cast p0, La/Ad;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1

    :cond_0
    instance-of v0, p0, La/E4;

    if-eqz v0, :cond_1

    check-cast p0, La/E4;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    return v1
.end method


# virtual methods
.method public final a()La/Vd;
    .locals 2

    new-instance v0, La/Vd;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, La/Vd$a;->a:La/w1;

    iput-object v1, v0, La/Vd;->a:La/w1;

    iget-object v1, p0, La/Vd$a;->b:La/w1;

    iput-object v1, v0, La/Vd;->b:La/w1;

    iget-object v1, p0, La/Vd$a;->c:La/w1;

    iput-object v1, v0, La/Vd;->c:La/w1;

    iget-object v1, p0, La/Vd$a;->d:La/w1;

    iput-object v1, v0, La/Vd;->d:La/w1;

    iget-object v1, p0, La/Vd$a;->e:La/w4;

    iput-object v1, v0, La/Vd;->e:La/w4;

    iget-object v1, p0, La/Vd$a;->f:La/w4;

    iput-object v1, v0, La/Vd;->f:La/w4;

    iget-object v1, p0, La/Vd$a;->g:La/w4;

    iput-object v1, v0, La/Vd;->g:La/w4;

    iget-object v1, p0, La/Vd$a;->h:La/w4;

    iput-object v1, v0, La/Vd;->h:La/w4;

    iget-object v1, p0, La/Vd$a;->i:La/H5;

    iput-object v1, v0, La/Vd;->i:La/H5;

    iget-object v1, p0, La/Vd$a;->j:La/H5;

    iput-object v1, v0, La/Vd;->j:La/H5;

    iget-object v1, p0, La/Vd$a;->k:La/H5;

    iput-object v1, v0, La/Vd;->k:La/H5;

    iget-object v1, p0, La/Vd$a;->l:La/H5;

    iput-object v1, v0, La/Vd;->l:La/H5;

    return-object v0
.end method
