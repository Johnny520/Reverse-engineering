.class public LYue/ۥۣۡۥۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۡۥۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣۡۥۧ;


# direct methods
.method public constructor <init>(LYue/ۥۣۡۥۧ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣۡۥۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣۡۥۧ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, LYue/ۥۣۡۥۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣۡۥۧ;

    iget-object p1, p1, LYue/ۥۣۡۥۨ;->ۥۣ۟۟۠:LYue/ۥۢۤۦ۠;

    invoke-virtual {p1}, LYue/ۥۢۤۦ۠;->getCurrentItem()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, LYue/ۥۢۤۦ۠;->setCurrentItem(I)V

    return-void
.end method
