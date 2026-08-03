.class public abstract LYue/ۥۣۡۥۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ۟۟:I = -0x1

.field public static final ۥ۟۟۟:I = -0x2


# instance fields
.field public final ۥ:Landroid/database/DataSetObservable;

.field public ۥ۟:Landroid/database/DataSetObserver;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/database/DataSetObservable;

    invoke-direct {v0}, Landroid/database/DataSetObservable;-><init>()V

    iput-object v0, p0, LYue/ۥۣۡۥۦ;->ۥ:Landroid/database/DataSetObservable;

    return-void
.end method


# virtual methods
.method public ۥ(Landroid/view/View;ILjava/lang/Object;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Required method destroyItem was not overridden"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۣۡۥۦ;->ۥ(Landroid/view/View;ILjava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public ۥ۟۟۟(Landroid/view/ViewGroup;)V
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, LYue/ۥۣۡۥۦ;->ۥ۟۟(Landroid/view/View;)V

    return-void
.end method

.method public abstract ۥ۟۟۟۟()I
.end method

.method public ۥ۟۟۟۠(Ljava/lang/Object;)I
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 p1, -0x1

    return p1
.end method

.method public ۥ۟۟۟ۡ(I)Ljava/lang/CharSequence;
    .locals 0
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟۟ۢ(I)F
    .locals 0

    const/high16 p1, 0x3f800000    # 1.0f

    return p1
.end method

.method public ۥۣ۟۟۟(Landroid/view/View;I)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Required method instantiateItem was not overridden"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟ۤ(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0, p1, p2}, LYue/ۥۣۡۥۦ;->ۥۣ۟۟۟(Landroid/view/View;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract ۥ۟۟۟ۥ(Landroid/view/View;Ljava/lang/Object;)Z
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
.end method

.method public ۥ۟۟۟ۦ()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥۣۡۥۦ;->ۥ۟:Landroid/database/DataSetObserver;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/database/DataSetObserver;->onChanged()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LYue/ۥۣۡۥۦ;->ۥ:Landroid/database/DataSetObservable;

    invoke-virtual {v0}, Landroid/database/DataSetObservable;->notifyChanged()V

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public ۥ۟۟۟ۧ(Landroid/database/DataSetObserver;)V
    .locals 1
    .param p1    # Landroid/database/DataSetObserver;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣۡۥۦ;->ۥ:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۟ۨ(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 0
    .param p1    # Landroid/os/Parcelable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/ClassLoader;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    return-void
.end method

.method public ۥ۟۟۠()Landroid/os/Parcelable;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟۠۟(Landroid/view/View;ILjava/lang/Object;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public ۥ۟۟۠۠(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۣۡۥۦ;->ۥ۟۟۠۟(Landroid/view/View;ILjava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۠ۡ(Landroid/database/DataSetObserver;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, LYue/ۥۣۡۥۦ;->ۥ۟:Landroid/database/DataSetObserver;

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ۥ۟۟۠ۢ(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public ۥۣ۟۟۠(Landroid/view/ViewGroup;)V
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, LYue/ۥۣۡۥۦ;->ۥ۟۟۠ۢ(Landroid/view/View;)V

    return-void
.end method

.method public ۥ۟۟۠ۤ(Landroid/database/DataSetObserver;)V
    .locals 1
    .param p1    # Landroid/database/DataSetObserver;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣۡۥۦ;->ۥ:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    return-void
.end method
