.class public final synthetic LJe;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AutoCompleteTextView$OnDismissListener;


# instance fields
.field public final synthetic a:LLe;


# direct methods
.method public synthetic constructor <init>(LLe;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJe;->a:LLe;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 4

    const/4 v0, 0x1

    iget-object v1, p0, LJe;->a:LLe;

    iput-boolean v0, v1, LLe;->m:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, LLe;->o:J

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, LLe;->s(Z)V

    return-void
.end method
