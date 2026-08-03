.class public LYue/ۥۡۡۥۣ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۡۥۣ;->onNestedPreScroll(Landroid/view/View;II[II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroid/view/View;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۡۡۥۣ;


# direct methods
.method public constructor <init>(LYue/ۥۡۡۥۣ;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۡۥۣ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۡۥۣ;

    iput-object p2, p0, LYue/ۥۡۡۥۣ$ۥ;->ۥۣ۟۟۠:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ;->ۥۣ۟۟۠:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setNestedScrollingEnabled(Z)V

    return-void
.end method
