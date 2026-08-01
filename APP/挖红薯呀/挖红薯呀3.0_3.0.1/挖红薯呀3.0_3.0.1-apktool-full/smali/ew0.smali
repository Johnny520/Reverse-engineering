.class public abstract Lew0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Ldw0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldq0;

    .line 2
    .line 3
    const/high16 v1, 0x42480000    # 50.0f

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldq0;-><init>(F)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ldw0;

    .line 9
    .line 10
    invoke-direct {v1, v0, v0, v0, v0}, Ldw0;-><init>(Lmk;Lmk;Lmk;Lmk;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lew0;->a:Ldw0;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(F)Ldw0;
    .locals 1

    .line 1
    new-instance v0, Lop;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lop;-><init>(F)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Ldw0;

    .line 7
    .line 8
    invoke-direct {p0, v0, v0, v0, v0}, Ldw0;-><init>(Lmk;Lmk;Lmk;Lmk;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
