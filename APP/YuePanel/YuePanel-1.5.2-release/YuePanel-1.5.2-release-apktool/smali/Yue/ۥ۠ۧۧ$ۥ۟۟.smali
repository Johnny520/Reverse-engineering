.class public LYue/ۥ۠ۧۧ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x21
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Ljava/lang/Object;)Landroid/os/LocaleList;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    check-cast p0, Landroid/app/LocaleManager;

    invoke-virtual {p0}, Landroid/app/LocaleManager;->getApplicationLocales()Landroid/os/LocaleList;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟(Ljava/lang/Object;)Landroid/os/LocaleList;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    check-cast p0, Landroid/app/LocaleManager;

    invoke-virtual {p0}, Landroid/app/LocaleManager;->getSystemLocales()Landroid/os/LocaleList;

    move-result-object p0

    return-object p0
.end method
