.class public final Lh90;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lcb1;


# instance fields
.field public final a:Lx51;


# direct methods
.method public constructor <init>(Lhw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lz60;->J(Lhw;)Lx51;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lh90;->a:Lx51;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lfq0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lh90;->a:Lx51;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx51;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
