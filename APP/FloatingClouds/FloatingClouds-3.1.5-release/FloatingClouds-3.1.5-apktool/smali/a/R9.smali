.class public final synthetic La/R9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# instance fields
.field public final synthetic a:Landroid/widget/AdapterView$OnItemLongClickListener;


# direct methods
.method public synthetic constructor <init>(La/T9;Landroid/widget/AdapterView$OnItemLongClickListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/R9;->a:Landroid/widget/AdapterView$OnItemLongClickListener;

    return-void
.end method


# virtual methods
.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 6

    invoke-static {p1}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {p2}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {p1, p2, p3}, La/T9;->f(Landroid/widget/AdapterView;Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v0, p0, La/R9;->a:Landroid/widget/AdapterView$OnItemLongClickListener;

    if-eqz v0, :cond_1

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemLongClickListener;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
