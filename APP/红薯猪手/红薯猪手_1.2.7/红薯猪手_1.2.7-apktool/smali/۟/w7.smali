.class public final L۟/w7;
.super L۟/kc$k;
.source "SourceFile"


# instance fields
.field public final synthetic ۥ:L۟/t7;


# direct methods
.method public constructor <init>(L۟/t7;)V
    .locals 0

    iput-object p1, p0, L۟/w7;->ۥ:L۟/t7;

    invoke-direct {p0}, L۟/kc$k;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(I)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 1
    iget-object v0, p0, L۟/w7;->ۥ:L۟/t7;

    .line 2
    .line 3
    sget v1, L۟/t7;->ۥۡ:I

    .line 4
    .line 5
    iget-object v0, v0, L۟/t7;->ۥ۠ۦ:L۟/kb;

    .line 6
    .line 7
    invoke-virtual {v0}, L۟/kb;->ۥ()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/widget/TextView;

    .line 12
    .line 13
    add-int/lit8 p1, p1, 0x1

    .line 14
    .line 15
    iget-object v1, p0, L۟/w7;->ۥ:L۟/t7;

    .line 16
    .line 17
    iget-object v1, v1, L۟/t7;->ۥ۠ۤ:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p1, "/"

    .line 32
    .line 33
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
