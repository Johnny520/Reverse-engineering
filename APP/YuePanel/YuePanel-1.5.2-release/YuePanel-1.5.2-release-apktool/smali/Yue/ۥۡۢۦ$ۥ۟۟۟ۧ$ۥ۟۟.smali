.class public final LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public ۥ:Landroid/app/PendingIntent;

.field public ۥ۟:Landroidx/core/graphics/drawable/IconCompat;

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I
    .annotation build LYue/ۥ۠۟ۡ;
    .end annotation
.end field

.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:Landroid/app/PendingIntent;

.field public ۥ۟۟۟ۡ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/app/PendingIntent;Landroidx/core/graphics/drawable/IconCompat;)V
    .locals 0
    .param p1    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/core/graphics/drawable/IconCompat;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 7
    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ:Landroid/app/PendingIntent;

    .line 8
    iput-object p2, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟:Landroidx/core/graphics/drawable/IconCompat;

    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Bubbles require non-null icon"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Bubble requires non-null pending intent"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1e
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟ۡ:Ljava/lang/String;

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Bubble requires a non-null shortcut id"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public ۥ()LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;
    .locals 10
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v7, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟ۡ:Ljava/lang/String;

    if-nez v7, :cond_1

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ:Landroid/app/PendingIntent;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Must supply pending intent or shortcut to bubble"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    if-nez v7, :cond_3

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Must supply an icon or shortcut for the bubble"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    new-instance v9, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ:Landroid/app/PendingIntent;

    iget-object v2, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟۠:Landroid/app/PendingIntent;

    iget-object v3, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟:Landroidx/core/graphics/drawable/IconCompat;

    iget v4, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟:I

    iget v5, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟:I

    iget v6, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟۟:I

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;-><init>(Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroidx/core/graphics/drawable/IconCompat;IIILjava/lang/String;LYue/ۥۡۢۦ$ۥ;)V

    iget v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟۟:I

    invoke-virtual {v9, v0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۤ(I)V

    return-object v9
.end method

.method public ۥ۟(Z)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟۠(IZ)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;

    return-object p0
.end method

.method public ۥ۟۟(Landroid/app/PendingIntent;)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;
    .locals 0
    .param p1    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟۠:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public ۥ۟۟۟(I)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥ۠۟ۡ۟;
            unit = 0x0
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟:I

    iput v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟:I

    return-object p0
.end method

.method public ۥ۟۟۟۟(I)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۠۟ۡ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟:I

    const/4 p1, 0x0

    iput p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟:I

    return-object p0
.end method

.method public final ۥ۟۟۟۠(IZ)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    if-eqz p2, :cond_0

    iget p2, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟۟:I

    or-int/2addr p1, p2

    iput p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟۟:I

    goto :goto_0

    :cond_0
    iget p2, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟۟:I

    not-int p1, p1

    and-int/2addr p1, p2

    iput p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟۟:I

    :goto_0
    return-object p0
.end method

.method public ۥ۟۟۟ۡ(Landroidx/core/graphics/drawable/IconCompat;)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;
    .locals 1
    .param p1    # Landroidx/core/graphics/drawable/IconCompat;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟ۡ:Ljava/lang/String;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟:Landroidx/core/graphics/drawable/IconCompat;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Bubbles require non-null icon"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟ۢ(Landroid/app/PendingIntent;)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;
    .locals 1
    .param p1    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟ۡ:Ljava/lang/String;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ:Landroid/app/PendingIntent;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Bubble requires non-null pending intent"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥۣ۟۟۟(Z)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;->ۥ۟۟۟۠(IZ)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;

    return-object p0
.end method
