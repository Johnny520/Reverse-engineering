.class public final La/Ua$a;
.super La/fc;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/Ua;->p(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/fc<",
        "TS;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:La/Ua;


# direct methods
.method public constructor <init>(La/Ua;)V
    .locals 0

    iput-object p1, p0, La/Ua$a;->a:La/Ua;

    invoke-direct {p0}, La/fc;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    iget-object v0, p0, La/Ua$a;->a:La/Ua;

    iget-object v0, v0, La/tc;->V:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/fc;

    invoke-virtual {v1, p1}, La/fc;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method
