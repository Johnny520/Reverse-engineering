.class public final Lc2$b;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc2;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lc2;


# direct methods
.method public constructor <init>(Lc2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc2$b;->d:Lc2;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    :cond_0
    const-string p1, ""

    .line 10
    .line 11
    :cond_1
    iget-object v0, p0, Lc2$b;->d:Lc2;

    .line 12
    .line 13
    const-string v1, "\u6211\u5df2\u77e5\u6653\u98ce\u9669\u5e76\u627f\u8bfa\u4ec5\u7528\u4e8e\u4e2a\u4eba\u5b66\u4e60\u4e1424\u5c0f\u65f6\u5185\u5220\u9664\uff0c\u5e76\u627f\u8bfa\u9075\u5b88\u4e0a\u8ff0\u884c\u4e3a\u7ea2\u7ebf\u4e0e\u7981\u6b62\u6761\u6b3e\uff0c\u5426\u5219\u81ea\u613f\u627f\u62c5\u4e00\u5207\u6cd5\u5f8b\u540e\u679c"

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {v0, p1}, Lc2;->q(Lc2;Z)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lc2$b;->d:Lc2;

    .line 23
    .line 24
    invoke-static {p0}, Lc2;->m(Lc2;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method
