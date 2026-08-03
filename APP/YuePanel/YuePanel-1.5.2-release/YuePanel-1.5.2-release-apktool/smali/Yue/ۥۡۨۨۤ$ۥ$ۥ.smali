.class public LYue/ۥۡۨۨۤ$ۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۨۨۤ$ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(Landroid/content/SharedPreferences$Editor;)V
    .locals 0
    .param p1    # Landroid/content/SharedPreferences$Editor;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    :try_start_0
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :goto_0
    return-void
.end method
