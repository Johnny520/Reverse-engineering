.class public final LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۢۦ$ۥ۟$ۥ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ$ۥ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# static fields
.field public static final ۥ۟۟۟۟:Ljava/lang/String; = "android.wearable.EXTENSIONS"

.field public static final ۥ۟۟۟۠:Ljava/lang/String; = "flags"

.field public static final ۥ۟۟۟ۡ:Ljava/lang/String; = "inProgressLabel"

.field public static final ۥ۟۟۟ۢ:Ljava/lang/String; = "confirmLabel"

.field public static final ۥۣ۟۟۟:Ljava/lang/String; = "cancelLabel"

.field public static final ۥ۟۟۟ۤ:I = 0x1

.field public static final ۥ۟۟۟ۥ:I = 0x2

.field public static final ۥ۟۟۟ۦ:I = 0x4

.field public static final ۥ۟۟۟ۧ:I = 0x1


# instance fields
.field public ۥ:I

.field public ۥ۟:Ljava/lang/CharSequence;

.field public ۥ۟۟:Ljava/lang/CharSequence;

.field public ۥ۟۟۟:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ:I

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۢۦ$ۥ۟;)V
    .locals 2
    .param p1    # LYue/ۥۡۢۦ$ۥ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 4
    iput v0, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ:I

    .line 5
    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟;->ۥ۟۟۟()Landroid/os/Bundle;

    move-result-object p1

    const-string v1, "android.wearable.EXTENSIONS"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 6
    const-string v1, "flags"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ:I

    .line 7
    const-string v0, "inProgressLabel"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟:Ljava/lang/CharSequence;

    .line 8
    const-string v0, "confirmLabel"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟۟:Ljava/lang/CharSequence;

    .line 9
    const-string v0, "cancelLabel"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟۟۟:Ljava/lang/CharSequence;

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟()LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(LYue/ۥۡۢۦ$ۥ۟$ۥ;)LYue/ۥۡۢۦ$ۥ۟$ۥ;
    .locals 3
    .param p1    # LYue/ۥۡۢۦ$ۥ۟$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget v1, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    const-string v2, "flags"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟:Ljava/lang/CharSequence;

    if-eqz v1, :cond_1

    const-string v2, "inProgressLabel"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_1
    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟۟:Ljava/lang/CharSequence;

    if-eqz v1, :cond_2

    const-string v2, "confirmLabel"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_2
    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟۟۟:Ljava/lang/CharSequence;

    if-eqz v1, :cond_3

    const-string v2, "cancelLabel"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_3
    invoke-virtual {p1}, LYue/ۥۡۢۦ$ۥ۟$ۥ;->ۥ۟۟۟ۡ()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "android.wearable.EXTENSIONS"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-object p1
.end method

.method public ۥ۟()LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;

    invoke-direct {v0}, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;-><init>()V

    iget v1, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ:I

    iput v1, v0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ:I

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟:Ljava/lang/CharSequence;

    iput-object v1, v0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟:Ljava/lang/CharSequence;

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟۟:Ljava/lang/CharSequence;

    iput-object v1, v0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟۟:Ljava/lang/CharSequence;

    iget-object v1, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟۟۟:Ljava/lang/CharSequence;

    iput-object v1, v0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟۟۟:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ۥ۟۟()Ljava/lang/CharSequence;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟۟۟:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ۥ۟۟۟()Ljava/lang/CharSequence;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟۟:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ۥ۟۟۟۟()Z
    .locals 1

    iget v0, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟۠()Z
    .locals 1

    iget v0, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟ۡ()Ljava/lang/CharSequence;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ۥ۟۟۟ۢ()Z
    .locals 2

    iget v0, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public ۥۣ۟۟۟(Z)LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟۟۟ۦ(IZ)V

    return-object p0
.end method

.method public ۥ۟۟۟ۤ(Ljava/lang/CharSequence;)LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟۟۟:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public ۥ۟۟۟ۥ(Ljava/lang/CharSequence;)LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟۟:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final ۥ۟۟۟ۦ(IZ)V
    .locals 0

    if-eqz p2, :cond_0

    iget p2, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ:I

    or-int/2addr p1, p2

    iput p1, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ:I

    goto :goto_0

    :cond_0
    iget p2, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ:I

    not-int p1, p1

    and-int/2addr p1, p2

    iput p1, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ:I

    :goto_0
    return-void
.end method

.method public ۥ۟۟۟ۧ(Z)LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟۟۟ۦ(IZ)V

    return-object p0
.end method

.method public ۥ۟۟۟ۨ(Z)LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟۟۟ۦ(IZ)V

    return-object p0
.end method

.method public ۥ۟۟۠(Ljava/lang/CharSequence;)LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟$ۥ۟۟۟;->ۥ۟:Ljava/lang/CharSequence;

    return-object p0
.end method
