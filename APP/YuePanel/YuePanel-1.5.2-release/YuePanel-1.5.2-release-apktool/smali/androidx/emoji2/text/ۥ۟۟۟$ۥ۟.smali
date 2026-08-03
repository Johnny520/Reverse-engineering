.class public Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/ۥ۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/emoji2/text/\u06e5\u06df\u06df\u06df$\u06e5\u06df\u06df<",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e6;",
        ">;"
    }
.end annotation


# instance fields
.field public ۥ:LYue/ۥۣۢ۠ۦ;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public final ۥ۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;


# direct methods
.method public constructor <init>(LYue/ۥۣۢ۠ۦ;Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;)V
    .locals 0
    .param p1    # LYue/ۥۣۢ۠ۦ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟;->ۥ:LYue/ۥۣۢ۠ۦ;

    iput-object p2, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/CharSequence;IILYue/ۥۢۢۤۥ;)Z
    .locals 3
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p4}, LYue/ۥۢۢۤۥ;->ۥ۟۟۟ۧ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟;->ۥ:LYue/ۥۣۢ۠ۦ;

    if-nez v0, :cond_2

    new-instance v0, LYue/ۥۣۢ۠ۦ;

    instance-of v2, p1, Landroid/text/Spannable;

    if-eqz v2, :cond_1

    check-cast p1, Landroid/text/Spannable;

    goto :goto_0

    :cond_1
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object p1, v2

    :goto_0
    invoke-direct {v0, p1}, LYue/ۥۣۢ۠ۦ;-><init>(Landroid/text/Spannable;)V

    iput-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟;->ۥ:LYue/ۥۣۢ۠ۦ;

    :cond_2
    iget-object p1, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;

    invoke-interface {p1, p4}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۧ;->ۥ(LYue/ۥۢۢۤۥ;)LYue/ۥ۠۠ۧ۠;

    move-result-object p1

    iget-object p4, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟;->ۥ:LYue/ۥۣۢ۠ۦ;

    const/16 v0, 0x21

    invoke-virtual {p4, p1, p2, p3, v0}, LYue/ۥۣۢ۠ۦ;->setSpan(Ljava/lang/Object;III)V

    return v1
.end method

.method public bridge synthetic ۥ۟()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟;->ۥ۟۟()LYue/ۥۣۢ۠ۦ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()LYue/ۥۣۢ۠ۦ;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟;->ۥ:LYue/ۥۣۢ۠ۦ;

    return-object v0
.end method
