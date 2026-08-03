.class public final LYue/ۥ۠ۧۦۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۧۦۧ;


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x18
.end annotation


# instance fields
.field public final ۥ:Landroid/os/LocaleList;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Landroid/os/LocaleList;

    iput-object p1, p0, LYue/ۥ۠ۧۦۨ;->ۥ:Landroid/os/LocaleList;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۦۨ;->ۥ:Landroid/os/LocaleList;

    check-cast p1, LYue/ۥ۠ۧۦۧ;

    invoke-interface {p1}, LYue/ۥ۠ۧۦۧ;->ۥ۟۟()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/LocaleList;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public get(I)Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۦۨ;->ۥ:Landroid/os/LocaleList;

    invoke-virtual {v0, p1}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۦۨ;->ۥ:Landroid/os/LocaleList;

    invoke-virtual {v0}, Landroid/os/LocaleList;->hashCode()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۦۨ;->ۥ:Landroid/os/LocaleList;

    invoke-virtual {v0}, Landroid/os/LocaleList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۦۨ;->ۥ:Landroid/os/LocaleList;

    invoke-virtual {v0}, Landroid/os/LocaleList;->size()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۦۨ;->ۥ:Landroid/os/LocaleList;

    invoke-virtual {v0}, Landroid/os/LocaleList;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(Ljava/util/Locale;)I
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۦۨ;->ۥ:Landroid/os/LocaleList;

    invoke-virtual {v0, p1}, Landroid/os/LocaleList;->indexOf(Ljava/util/Locale;)I

    move-result p1

    return p1
.end method

.method public ۥ۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۦۨ;->ۥ:Landroid/os/LocaleList;

    invoke-virtual {v0}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۦۨ;->ۥ:Landroid/os/LocaleList;

    return-object v0
.end method

.method public ۥ۟۟۟([Ljava/lang/String;)Ljava/util/Locale;
    .locals 1
    .param p1    # [Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۧۦۨ;->ۥ:Landroid/os/LocaleList;

    invoke-virtual {v0, p1}, Landroid/os/LocaleList;->getFirstMatch([Ljava/lang/String;)Ljava/util/Locale;

    move-result-object p1

    return-object p1
.end method
