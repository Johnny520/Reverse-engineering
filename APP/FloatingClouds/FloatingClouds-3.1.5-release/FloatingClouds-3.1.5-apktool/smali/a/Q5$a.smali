.class public final La/Q5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/Q5$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/Q5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/Q5$b<",
        "La/Xf;",
        ">;"
    }
.end annotation


# instance fields
.field public a:La/Xf;

.field public final b:Landroidx/emoji2/text/c$d;


# direct methods
.method public constructor <init>(La/Xf;Landroidx/emoji2/text/c$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/Q5$a;->a:La/Xf;

    iput-object p2, p0, La/Q5$a;->b:Landroidx/emoji2/text/c$d;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La/Q5$a;->a:La/Xf;

    return-object v0
.end method

.method public final b(Ljava/lang/CharSequence;IILa/Tf;)Z
    .locals 3

    iget v0, p4, La/Tf;->c:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x1

    if-lez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, La/Q5$a;->a:La/Xf;

    if-nez v0, :cond_2

    new-instance v0, La/Xf;

    instance-of v2, p1, Landroid/text/Spannable;

    if-eqz v2, :cond_1

    check-cast p1, Landroid/text/Spannable;

    goto :goto_0

    :cond_1
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object p1, v2

    :goto_0
    invoke-direct {v0, p1}, La/Xf;-><init>(Landroid/text/Spannable;)V

    iput-object v0, p0, La/Q5$a;->a:La/Xf;

    :cond_2
    iget-object p1, p0, La/Q5$a;->b:Landroidx/emoji2/text/c$d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, La/Uf;

    invoke-direct {p1, p4}, La/R5;-><init>(La/Tf;)V

    iget-object p4, p0, La/Q5$a;->a:La/Xf;

    const/16 v0, 0x21

    invoke-virtual {p4, p1, p2, p3, v0}, La/Xf;->setSpan(Ljava/lang/Object;III)V

    return v1
.end method
