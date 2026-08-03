.class public final LV/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li/f;

.field public b:Z

.field public c:Landroid/os/Bundle;

.field public d:LV/a;

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Li/f;

    invoke-direct {v0}, Li/f;-><init>()V

    iput-object v0, p0, LV/e;->a:Li/f;

    const/4 v0, 0x1

    iput-boolean v0, p0, LV/e;->e:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "You can consumeRestoredStateForKey only after super.onCreate of corresponding component"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Ljava/lang/String;LV/d;)V
    .locals 2

    const-string v0, "provider"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV/e;->a:Li/f;

    invoke-virtual {v0, p1}, Li/f;->a(Ljava/lang/Object;)Li/c;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object p1, v1, Li/c;->b:Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance v1, Li/c;

    invoke-direct {v1, p1, p2}, Li/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget p1, v0, Li/f;->d:I

    add-int/lit8 p1, p1, 0x1

    iput p1, v0, Li/f;->d:I

    iget-object p1, v0, Li/f;->b:Li/c;

    if-nez p1, :cond_1

    iput-object v1, v0, Li/f;->a:Li/c;

    iput-object v1, v0, Li/f;->b:Li/c;

    goto :goto_0

    :cond_1
    iput-object v1, p1, Li/c;->c:Li/c;

    iput-object p1, v1, Li/c;->d:Li/c;

    iput-object v1, v0, Li/f;->b:Li/c;

    :goto_0
    const/4 p1, 0x0

    :goto_1
    check-cast p1, LV/d;

    if-nez p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "SavedStateProvider with the given key is already registered"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()V
    .locals 5

    const-class v0, Landroidx/lifecycle/i;

    iget-boolean v1, p0, LV/e;->e:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, LV/e;->d:LV/a;

    if-nez v1, :cond_0

    new-instance v1, LV/a;

    invoke-direct {v1, p0}, LV/a;-><init>(LV/e;)V

    :cond_0
    iput-object v1, p0, LV/e;->d:LV/a;

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, LV/e;->d:LV/a;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, v1, LV/a;->a:Ljava/util/LinkedHashSet;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Class "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " must have default constructor in order to be automatically recreated"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can not perform this action after onSaveInstanceState"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
