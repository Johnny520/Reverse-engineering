.class public final La/Kg$a;
.super La/n9;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/Kg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public b:Z

.field public c:I

.field public final synthetic d:La/Kg;


# direct methods
.method public constructor <init>(La/Kg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/Kg$a;->d:La/Kg;

    const/4 p1, 0x0

    iput-boolean p1, p0, La/Kg$a;->b:Z

    iput p1, p0, La/Kg$a;->c:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget v0, p0, La/Kg$a;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, La/Kg$a;->c:I

    iget-object v1, p0, La/Kg$a;->d:La/Kg;

    iget-object v2, v1, La/Kg;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ne v0, v2, :cond_1

    iget-object v0, v1, La/Kg;->d:La/n9;

    if-eqz v0, :cond_0

    invoke-interface {v0}, La/Lg;->a()V

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, La/Kg$a;->c:I

    iput-boolean v0, p0, La/Kg$a;->b:Z

    iput-boolean v0, v1, La/Kg;->e:Z

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 1

    iget-boolean v0, p0, La/Kg$a;->b:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, La/Kg$a;->b:Z

    iget-object v0, p0, La/Kg$a;->d:La/Kg;

    iget-object v0, v0, La/Kg;->d:La/n9;

    if-eqz v0, :cond_1

    invoke-interface {v0}, La/Lg;->c()V

    :cond_1
    :goto_0
    return-void
.end method
