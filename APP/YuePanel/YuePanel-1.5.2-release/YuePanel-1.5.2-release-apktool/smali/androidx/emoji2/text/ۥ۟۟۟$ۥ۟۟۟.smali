.class public Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟;
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
    name = "\u06e5\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/emoji2/text/\u06e5\u06df\u06df\u06df$\u06e5\u06df\u06df<",
        "Landroidx/emoji2/text/\u06e5\u06df\u06df\u06df$\u06e5\u06df\u06df\u06df;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ:I

.field public ۥ۟:I

.field public ۥ۟۟:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟:I

    iput v0, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟۟:I

    iput p1, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟;->ۥ:I

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/CharSequence;IILYue/ۥۢۢۤۥ;)Z
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget p1, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟;->ۥ:I

    const/4 p4, 0x0

    if-gt p2, p1, :cond_0

    if-ge p1, p3, :cond_0

    iput p2, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟:I

    iput p3, p0, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟۟:I

    return p4

    :cond_0
    if-gt p3, p1, :cond_1

    const/4 p4, 0x1

    :cond_1
    return p4
.end method

.method public bridge synthetic ۥ۟()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟;->ۥ۟۟()Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()Landroidx/emoji2/text/ۥ۟۟۟$ۥ۟۟۟;
    .locals 0

    return-object p0
.end method
