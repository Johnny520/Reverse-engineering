.class public final LV0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV0/h;
.implements LV0/b;


# instance fields
.field public final a:LV0/h;

.field public final b:I


# direct methods
.method public constructor <init>(LV0/h;)V
    .locals 1

    const-string v0, "sequence"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV0/o;->a:LV0/h;

    const/16 p1, 0x8

    iput p1, p0, LV0/o;->b:I

    return-void
.end method


# virtual methods
.method public final a()LV0/h;
    .locals 2

    const/16 v0, 0x8

    iget v1, p0, LV0/o;->b:I

    if-lt v0, v1, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, LV0/o;

    iget-object v1, p0, LV0/o;->a:LV0/h;

    invoke-direct {v0, v1}, LV0/o;-><init>(LV0/h;)V

    :goto_0
    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LE0/c;

    invoke-direct {v0, p0}, LE0/c;-><init>(LV0/o;)V

    return-object v0
.end method
