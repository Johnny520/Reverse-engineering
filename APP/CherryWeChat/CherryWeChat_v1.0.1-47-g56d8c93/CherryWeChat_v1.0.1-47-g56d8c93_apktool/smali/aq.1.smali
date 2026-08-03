.class public final synthetic Laq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:Ljq;

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ljq;Ljava/util/ArrayList;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laq;->a:Ljq;

    iput-object p2, p0, Laq;->b:Ljava/util/ArrayList;

    iput p3, p0, Laq;->c:I

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    iget p1, p0, Laq;->c:I

    add-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Laq;->a:Ljq;

    iget-object v1, p0, Laq;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, p1}, Ljq;->l(Ljava/util/ArrayList;I)V

    return-void
.end method
