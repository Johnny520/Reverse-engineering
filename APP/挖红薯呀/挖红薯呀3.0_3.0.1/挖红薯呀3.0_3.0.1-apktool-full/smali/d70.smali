.class public final Ld70;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lea;


# instance fields
.field public final synthetic a:Le70;

.field public final synthetic b:Lzt0;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Le70;Lzt0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld70;->a:Le70;

    .line 5
    .line 6
    iput-object p2, p0, Ld70;->b:Lzt0;

    .line 7
    .line 8
    iput p3, p0, Ld70;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ld70;->b:Lzt0;

    .line 2
    .line 3
    iget-object v0, v0, Lzt0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La70;

    .line 6
    .line 7
    iget v1, p0, Ld70;->c:I

    .line 8
    .line 9
    iget-object p0, p0, Ld70;->a:Le70;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Le70;->w0(La70;I)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method
