.class public abstract L۟/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final ۥ:L۟/z7;

.field public final ۥ۟:L۟/w8;

.field public final ۥ۟۟:L۟/f$a;

.field public final ۥ۟۠:Z

.field public final ۥ۟ۡ:I

.field public final ۥ۟ۢ:I

.field public final ۥۣ۟:I

.field public final ۥ۟ۤ:Landroid/graphics/drawable/Drawable;

.field public final ۥ۟ۥ:Ljava/lang/String;

.field public final ۥ۟ۦ:Ljava/lang/Object;

.field public ۥ۟ۧ:Z

.field public ۥ۟ۨ:Z


# direct methods
.method public constructor <init>(L۟/z7;Ljava/lang/Object;L۟/w8;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L۟/f;->ۥ:L۟/z7;

    iput-object p3, p0, L۟/f;->ۥ۟:L۟/w8;

    new-instance p3, L۟/f$a;

    iget-object p1, p1, L۟/z7;->ۥ۟ۥ:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p3, p0, p2, p1}, L۟/f$a;-><init>(L۟/f;Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    iput-object p3, p0, L۟/f;->ۥ۟۟:L۟/f$a;

    const/4 p1, 0x0

    iput p1, p0, L۟/f;->ۥ۟ۡ:I

    iput p1, p0, L۟/f;->ۥ۟ۢ:I

    iput-boolean p5, p0, L۟/f;->ۥ۟۠:Z

    iput p1, p0, L۟/f;->ۥۣ۟:I

    const/4 p1, 0x0

    iput-object p1, p0, L۟/f;->ۥ۟ۤ:Landroid/graphics/drawable/Drawable;

    iput-object p4, p0, L۟/f;->ۥ۟ۥ:Ljava/lang/String;

    iput-object p0, p0, L۟/f;->ۥ۟ۦ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, L۟/f;->ۥ۟ۨ:Z

    return-void
.end method

.method public abstract ۥ۟(Landroid/graphics/Bitmap;L۟/z7$e;)V
.end method

.method public abstract ۥ۟۟()V
.end method

.method public final ۥ۟۠()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, L۟/f;->ۥ۟۟:L۟/f$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0
.end method
