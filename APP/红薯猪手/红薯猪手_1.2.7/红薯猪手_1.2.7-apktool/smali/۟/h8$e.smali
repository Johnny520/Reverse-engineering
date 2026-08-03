.class public final L۟/h8$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/h8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public ۥ:Landroid/view/View$OnClickListener;

.field public final synthetic ۥ۟:L۟/h8;


# direct methods
.method public constructor <init>(L۟/h8;Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, L۟/h8$e;->ۥ۟:L۟/h8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, L۟/h8$e;->ۥ:Landroid/view/View$OnClickListener;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, L۟/h8$e;->ۥ۟:L۟/h8;

    iget-boolean v1, v0, L۟/h8;->ۥۣ۟:Z

    xor-int/lit8 v1, v1, 0x1

    iput-boolean v1, v0, L۟/h8;->ۥۣ۟:Z

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    iget-object v0, p0, L۟/h8$e;->ۥ۟:L۟/h8;

    iget-object v1, v0, L۟/h8;->ۥ۠۠:L۟/h8$d;

    if-eqz v1, :cond_0

    iget-boolean v0, v0, L۟/h8;->ۥۣ۟:Z

    invoke-interface {v1, v0}, L۟/h8$d;->ۥ(Z)V

    :cond_0
    iget-object v0, p0, L۟/h8$e;->ۥ:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_1
    return-void
.end method
