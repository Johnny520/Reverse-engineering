.class public Landroidx/core/app/RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(LYue/ۥۣۢۦۡ;)Landroidx/core/app/RemoteActionCompat;
    .locals 3

    new-instance v0, Landroidx/core/app/RemoteActionCompat;

    invoke-direct {v0}, Landroidx/core/app/RemoteActionCompat;-><init>()V

    iget-object v1, v0, Landroidx/core/app/RemoteActionCompat;->ۥ:Landroidx/core/graphics/drawable/IconCompat;

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, LYue/ۥۣۢۦۡ;->ۥ۟۟ۤ۟(LYue/ۥۣۢۦۤ;I)LYue/ۥۣۢۦۤ;

    move-result-object v1

    check-cast v1, Landroidx/core/graphics/drawable/IconCompat;

    iput-object v1, v0, Landroidx/core/app/RemoteActionCompat;->ۥ:Landroidx/core/graphics/drawable/IconCompat;

    iget-object v1, v0, Landroidx/core/app/RemoteActionCompat;->ۥ۟:Ljava/lang/CharSequence;

    const/4 v2, 0x2

    invoke-virtual {p0, v1, v2}, LYue/ۥۣۢۦۡ;->ۥ۟۟۠ۦ(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v0, Landroidx/core/app/RemoteActionCompat;->ۥ۟:Ljava/lang/CharSequence;

    iget-object v1, v0, Landroidx/core/app/RemoteActionCompat;->ۥ۟۟:Ljava/lang/CharSequence;

    const/4 v2, 0x3

    invoke-virtual {p0, v1, v2}, LYue/ۥۣۢۦۡ;->ۥ۟۟۠ۦ(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v0, Landroidx/core/app/RemoteActionCompat;->ۥ۟۟:Ljava/lang/CharSequence;

    iget-object v1, v0, Landroidx/core/app/RemoteActionCompat;->ۥ۟۟۟:Landroid/app/PendingIntent;

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v2}, LYue/ۥۣۢۦۡ;->ۥۣ۟۟۟(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/app/PendingIntent;

    iput-object v1, v0, Landroidx/core/app/RemoteActionCompat;->ۥ۟۟۟:Landroid/app/PendingIntent;

    iget-boolean v1, v0, Landroidx/core/app/RemoteActionCompat;->ۥ۟۟۟۟:Z

    const/4 v2, 0x5

    invoke-virtual {p0, v1, v2}, LYue/ۥۣۢۦۡ;->ۥ۟۟۟ۧ(ZI)Z

    move-result v1

    iput-boolean v1, v0, Landroidx/core/app/RemoteActionCompat;->ۥ۟۟۟۟:Z

    iget-boolean v1, v0, Landroidx/core/app/RemoteActionCompat;->ۥ۟۟۟۠:Z

    const/4 v2, 0x6

    invoke-virtual {p0, v1, v2}, LYue/ۥۣۢۦۡ;->ۥ۟۟۟ۧ(ZI)Z

    move-result p0

    iput-boolean p0, v0, Landroidx/core/app/RemoteActionCompat;->ۥ۟۟۟۠:Z

    return-object v0
.end method

.method public static write(Landroidx/core/app/RemoteActionCompat;LYue/ۥۣۢۦۡ;)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0}, LYue/ۥۣۢۦۡ;->ۥ۟۟ۤۡ(ZZ)V

    iget-object v0, p0, Landroidx/core/app/RemoteActionCompat;->ۥ:Landroidx/core/graphics/drawable/IconCompat;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, LYue/ۥۣۢۦۡ;->ۥ۟۠۟۠(LYue/ۥۣۢۦۤ;I)V

    iget-object v0, p0, Landroidx/core/app/RemoteActionCompat;->ۥ۟:Ljava/lang/CharSequence;

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, LYue/ۥۣۢۦۡ;->ۥ۟۟ۥۦ(Ljava/lang/CharSequence;I)V

    iget-object v0, p0, Landroidx/core/app/RemoteActionCompat;->ۥ۟۟:Ljava/lang/CharSequence;

    const/4 v1, 0x3

    invoke-virtual {p1, v0, v1}, LYue/ۥۣۢۦۡ;->ۥ۟۟ۥۦ(Ljava/lang/CharSequence;I)V

    iget-object v0, p0, Landroidx/core/app/RemoteActionCompat;->ۥ۟۟۟:Landroid/app/PendingIntent;

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, LYue/ۥۣۢۦۡ;->ۥ۟۟ۧۨ(Landroid/os/Parcelable;I)V

    iget-boolean v0, p0, Landroidx/core/app/RemoteActionCompat;->ۥ۟۟۟۟:Z

    const/4 v1, 0x5

    invoke-virtual {p1, v0, v1}, LYue/ۥۣۢۦۡ;->ۥ۟۟ۤۥ(ZI)V

    iget-boolean p0, p0, Landroidx/core/app/RemoteActionCompat;->ۥ۟۟۟۠:Z

    const/4 v0, 0x6

    invoke-virtual {p1, p0, v0}, LYue/ۥۣۢۦۡ;->ۥ۟۟ۤۥ(ZI)V

    return-void
.end method
