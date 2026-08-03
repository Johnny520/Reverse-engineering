.class final synthetic Landroidx/lifecycle/Transformations$sam$androidx_lifecycle_Observer$0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;
.implements LYue/ۥۣۣ۠ۡ;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/Transformations;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final synthetic function:LYue/ۥۣ۠ۡ۟;


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۡ۟;)V
    .locals 1

    const-string v0, "function"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/Transformations$sam$androidx_lifecycle_Observer$0;->function:LYue/ۥۣ۠ۡ۟;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    instance-of v0, p1, Landroidx/lifecycle/Observer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, LYue/ۥۣۣ۠ۡ;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/lifecycle/Transformations$sam$androidx_lifecycle_Observer$0;->getFunctionDelegate()LYue/ۥۣۣ۠ۢ;

    move-result-object v0

    check-cast p1, LYue/ۥۣۣ۠ۡ;

    invoke-interface {p1}, LYue/ۥۣۣ۠ۡ;->getFunctionDelegate()LYue/ۥۣۣ۠ۢ;

    move-result-object p1

    invoke-static {v0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_0
    return v1
.end method

.method public final getFunctionDelegate()LYue/ۥۣۣ۠ۢ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e3<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/lifecycle/Transformations$sam$androidx_lifecycle_Observer$0;->function:LYue/ۥۣ۠ۡ۟;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Landroidx/lifecycle/Transformations$sam$androidx_lifecycle_Observer$0;->getFunctionDelegate()LYue/ۥۣۣ۠ۢ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic onChanged(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/Transformations$sam$androidx_lifecycle_Observer$0;->function:LYue/ۥۣ۠ۡ۟;

    invoke-interface {v0, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
