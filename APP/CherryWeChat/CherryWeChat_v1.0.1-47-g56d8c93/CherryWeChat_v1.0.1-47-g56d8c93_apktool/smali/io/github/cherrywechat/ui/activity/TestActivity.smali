.class public final Lio/github/cherrywechat/ui/activity/TestActivity;
.super Lt5;
.source ""


# static fields
.field public static final synthetic A:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lt5;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate()V
    .locals 3

    const v0, 0x550d001d

    invoke-virtual {p0, v0}, Lc3;->setContentView(I)V

    const v0, 0x550a022e

    invoke-virtual {p0, v0}, Lc3;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    new-instance v1, LZ4;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, LZ4;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
