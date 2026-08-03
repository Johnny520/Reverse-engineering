.class public final Landroidx/lifecycle/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/lifecycle/n$b;

.field public static final b:Landroidx/lifecycle/n$c;

.field public static final c:Landroidx/lifecycle/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/n$b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/lifecycle/n;->a:Landroidx/lifecycle/n$b;

    new-instance v0, Landroidx/lifecycle/n$c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/lifecycle/n;->b:Landroidx/lifecycle/n$c;

    new-instance v0, Landroidx/lifecycle/n$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/n$a;

    return-void
.end method

.method public static final a(La/Ab;)Landroidx/lifecycle/m;
    .locals 7

    sget-object v0, Landroidx/lifecycle/n;->a:Landroidx/lifecycle/n$b;

    iget-object p0, p0, La/A4;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/Ld;

    if-eqz v0, :cond_8

    sget-object v1, Landroidx/lifecycle/n;->b:Landroidx/lifecycle/n$c;

    invoke-virtual {p0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/Gg;

    if-eqz v1, :cond_7

    sget-object v2, Landroidx/lifecycle/n;->c:Landroidx/lifecycle/n$a;

    invoke-virtual {p0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    sget-object v3, Landroidx/lifecycle/r;->a:Landroidx/lifecycle/r;

    invoke-virtual {p0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_6

    invoke-interface {v0}, La/Ld;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/savedstate/a;->b()Landroidx/savedstate/a$b;

    move-result-object v0

    instance-of v3, v0, La/Hd;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v0, La/Hd;

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    if-eqz v0, :cond_5

    invoke-static {v1}, Landroidx/lifecycle/n;->c(La/Gg;)La/Id;

    move-result-object v1

    iget-object v1, v1, La/Id;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/lifecycle/m;

    if-nez v3, :cond_4

    sget-object v3, Landroidx/lifecycle/m;->f:[Ljava/lang/Class;

    invoke-virtual {v0}, La/Hd;->b()V

    iget-object v3, v0, La/Hd;->c:Landroid/os/Bundle;

    if-eqz v3, :cond_1

    invoke-virtual {v3, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v4

    :goto_1
    iget-object v5, v0, La/Hd;->c:Landroid/os/Bundle;

    if-eqz v5, :cond_2

    invoke-virtual {v5, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_2
    iget-object v5, v0, La/Hd;->c:Landroid/os/Bundle;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_3

    iput-object v4, v0, La/Hd;->c:Landroid/os/Bundle;

    :cond_3
    invoke-static {v3, v2}, Landroidx/lifecycle/m$a;->a(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/m;

    move-result-object v0

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_4
    return-object v3

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(La/Ld;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "La/Ld;",
            ":",
            "La/Gg;",
            ">(TT;)V"
        }
    .end annotation

    invoke-interface {p0}, La/y9;->getLifecycle()Landroidx/lifecycle/e;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/e;->b()Landroidx/lifecycle/e$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/e$b;->b:Landroidx/lifecycle/e$b;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroidx/lifecycle/e$b;->c:Landroidx/lifecycle/e$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-interface {p0}, La/Ld;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/savedstate/a;->b()Landroidx/savedstate/a$b;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, La/Hd;

    invoke-interface {p0}, La/Ld;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v1

    move-object v2, p0

    check-cast v2, La/Gg;

    invoke-direct {v0, v1, v2}, La/Hd;-><init>(Landroidx/savedstate/a;La/Gg;)V

    invoke-interface {p0}, La/Ld;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v1

    const-string v2, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v1, v2, v0}, Landroidx/savedstate/a;->c(Ljava/lang/String;Landroidx/savedstate/a$b;)V

    invoke-interface {p0}, La/y9;->getLifecycle()Landroidx/lifecycle/e;

    move-result-object p0

    new-instance v1, Landroidx/lifecycle/SavedStateHandleAttacher;

    invoke-direct {v1, v0}, Landroidx/lifecycle/SavedStateHandleAttacher;-><init>(La/Hd;)V

    invoke-virtual {p0, v1}, Landroidx/lifecycle/e;->a(La/x9;)V

    :cond_2
    return-void
.end method

.method public static final c(La/Gg;)La/Id;
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, La/Tc;->a:La/Uc;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La/f3;

    const-class v2, La/Id;

    invoke-direct {v1, v2}, La/f3;-><init>(Ljava/lang/Class;)V

    new-instance v3, La/Eg;

    invoke-interface {v1}, La/a3;->a()Ljava/lang/Class;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"

    invoke-static {v1, v4}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v1}, La/Eg;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, La/W8;

    const/4 v3, 0x0

    new-array v3, v3, [La/Eg;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/Eg;

    array-length v3, v0

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/Eg;

    invoke-direct {v1, v0}, La/W8;-><init>([La/Eg;)V

    new-instance v0, Landroidx/lifecycle/q;

    invoke-interface {p0}, La/Gg;->getViewModelStore()La/Fg;

    move-result-object v3

    instance-of v4, p0, Landroidx/lifecycle/c;

    if-eqz v4, :cond_0

    check-cast p0, Landroidx/lifecycle/c;

    invoke-interface {p0}, Landroidx/lifecycle/c;->getDefaultViewModelCreationExtras()La/A4;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, La/A4$a;->b:La/A4$a;

    :goto_0
    invoke-direct {v0, v3, v1, p0}, Landroidx/lifecycle/q;-><init>(La/Fg;Landroidx/lifecycle/q$b;La/A4;)V

    const-string p0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    invoke-virtual {v0, v2, p0}, Landroidx/lifecycle/q;->a(Ljava/lang/Class;Ljava/lang/String;)La/Dg;

    move-result-object p0

    check-cast p0, La/Id;

    return-object p0
.end method
