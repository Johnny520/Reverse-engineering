.class public final L۟/n5;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/m5;


# direct methods
.method public constructor <init>(L۟/m5;)V
    .locals 0

    iput-object p1, p0, L۟/n5;->ۥ:L۟/m5;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, L۟/n5;->ۥ:L۟/m5;

    .line 2
    .line 3
    iget-object v0, v0, L۟/m5;->ۥ۠ۥ:Landroid/widget/TextView;

    .line 4
    .line 5
    sget v1, L۟/o;->ۥ:I

    .line 6
    .line 7
    sget-object v1, L۟/m;->ۥ:L۟/m;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, L۟/m;->ۥ۟۠()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, L۟/o;->ۥ۠۠(Ljava/lang/String;)Landroid/text/Spanned;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, L۟/vb;->ۥ:L۟/vb;

    .line 24
    .line 25
    return-object v0
.end method
