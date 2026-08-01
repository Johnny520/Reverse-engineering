.class public final synthetic Lf30;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lg30;


# direct methods
.method public synthetic constructor <init>(Lg30;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf30;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lf30;->ζ:Lg30;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lf30;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lorg/luckypray/dexkit/query/FindField;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lf30;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iget-object p0, p0, Lf30;->ζ:Lg30;

    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, Lf30;-><init>(Lg30;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/query/FindField;->matcher(La80;)Lorg/luckypray/dexkit/query/FindField;

    .line 20
    .line 21
    .line 22
    sget-object p0, Ls62;->α:Ls62;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    move-object v0, p1

    .line 26
    check-cast v0, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const-string p1, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B718B9AE6B1"

    .line 32
    .line 33
    invoke-static {p1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v4, 0x6

    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v2, 0x0

    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->declaredClass$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Lf30;->ζ:Lg30;

    .line 45
    .line 46
    iget-object p1, p0, Lg30;->η:Ljava/lang/String;

    .line 47
    .line 48
    const-string v1, "boolean"

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    const/4 v4, 0x6

    .line 57
    const/4 v5, 0x0

    .line 58
    const-string v1, "boolean"

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    iget-object v1, p0, Lg30;->η:Ljava/lang/String;

    .line 67
    .line 68
    const/4 v4, 0x6

    .line 69
    const/4 v5, 0x0

    .line 70
    const/4 v2, 0x0

    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/query/matchers/FieldMatcher;->type$default(Lorg/luckypray/dexkit/query/matchers/FieldMatcher;Ljava/lang/String;Lorg/luckypray/dexkit/query/enums/StringMatchType;ZILjava/lang/Object;)Lorg/luckypray/dexkit/query/matchers/FieldMatcher;

    .line 73
    .line 74
    .line 75
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 76
    .line 77
    return-object p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
