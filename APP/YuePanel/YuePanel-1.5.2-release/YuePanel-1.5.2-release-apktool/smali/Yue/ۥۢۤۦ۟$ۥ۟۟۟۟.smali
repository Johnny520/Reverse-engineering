.class public final LYue/ۥۢۤۦ۟$ۥ۟۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,414:1\n69#2,2:415\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۤۦ۟;->ۥ۟۟۟(Landroid/view/View;LYue/ۥۣ۠ۡ۟;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,414:1\n69#2,2:415\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۣ۠ۡ۟;


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۡ۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۤۦ۟$ۥ۟۟۟۟;->ۥ:LYue/ۥۣ۠ۡ۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object p2, p0, LYue/ۥۢۤۦ۟$ۥ۟۟۟۟;->ۥ:LYue/ۥۣ۠ۡ۟;

    invoke-interface {p2, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
