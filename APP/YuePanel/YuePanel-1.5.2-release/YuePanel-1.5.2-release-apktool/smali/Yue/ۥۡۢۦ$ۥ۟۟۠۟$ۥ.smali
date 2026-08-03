.class public LYue/ۥۡۢۦ$ۥ۟۟۠۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x14
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ$ۥ۟۟۠۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/app/RemoteInput$Builder;Landroid/os/Bundle;)Landroid/app/RemoteInput$Builder;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/app/RemoteInput$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/RemoteInput$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟(Landroid/app/RemoteInput$Builder;)Landroid/app/RemoteInput;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/RemoteInput$Builder;->build()Landroid/app/RemoteInput;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟(Landroid/app/RemoteInput;)Landroid/os/Parcelable;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    return-object p0
.end method

.method public static ۥ۟۟۟(Ljava/lang/String;)Landroid/app/RemoteInput$Builder;
    .locals 1
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    new-instance v0, Landroid/app/RemoteInput$Builder;

    invoke-direct {v0, p0}, Landroid/app/RemoteInput$Builder;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ۥ۟۟۟۟(Landroid/app/RemoteInput;)Z
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/RemoteInput;->getAllowFreeFormInput()Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟۠(Landroid/app/RemoteInput;)[Ljava/lang/CharSequence;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/RemoteInput;->getChoices()[Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۡ(Landroid/app/RemoteInput;)Landroid/os/Bundle;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/RemoteInput;->getExtras()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۢ(Landroid/app/RemoteInput;)Ljava/lang/CharSequence;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/RemoteInput;->getLabel()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static ۥۣ۟۟۟(Landroid/app/RemoteInput;)Ljava/lang/String;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/app/RemoteInput;->getResultKey()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۤ(Landroid/app/RemoteInput$Builder;Z)Landroid/app/RemoteInput$Builder;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/app/RemoteInput$Builder;->setAllowFreeFormInput(Z)Landroid/app/RemoteInput$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۥ(Landroid/app/RemoteInput$Builder;[Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/app/RemoteInput$Builder;->setChoices([Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۦ(Landroid/app/RemoteInput$Builder;Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/app/RemoteInput$Builder;->setLabel(Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;

    move-result-object p0

    return-object p0
.end method
