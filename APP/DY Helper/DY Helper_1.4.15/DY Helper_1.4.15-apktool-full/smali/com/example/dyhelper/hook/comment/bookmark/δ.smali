.class public final synthetic Lcom/example/dyhelper/hook/comment/bookmark/δ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

.field public final synthetic θ:Landroid/widget/TextView;

.field public final synthetic ι:Landroid/widget/TextView;

.field public final synthetic κ:Landroid/widget/TextView;

.field public final synthetic λ:Landroid/widget/ListView;

.field public final synthetic μ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;

.field public final synthetic ν:Landroid/widget/TextView;

.field public final synthetic ξ:Landroid/widget/TextView;

.field public final synthetic ο:Landroid/widget/TextView;

.field public final synthetic π:Landroid/widget/TextView;

.field public final synthetic ρ:Landroid/widget/TextView;

.field public final synthetic σ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;

.field public final synthetic τ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;

.field public final synthetic υ:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(Ljava/io/Serializable;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;I)V
    .locals 1

    .line 1
    move/from16 v0, p16

    .line 2
    .line 3
    iput v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ε:I

    .line 4
    .line 5
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->υ:Ljava/io/Serializable;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ζ:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->η:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->θ:Landroid/widget/TextView;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ι:Landroid/widget/TextView;

    .line 14
    .line 15
    iput-object p6, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->κ:Landroid/widget/TextView;

    .line 16
    .line 17
    iput-object p7, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->λ:Landroid/widget/ListView;

    .line 18
    .line 19
    iput-object p8, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->μ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;

    .line 20
    .line 21
    iput-object p9, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ν:Landroid/widget/TextView;

    .line 22
    .line 23
    iput-object p10, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ξ:Landroid/widget/TextView;

    .line 24
    .line 25
    iput-object p11, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ο:Landroid/widget/TextView;

    .line 26
    .line 27
    iput-object p12, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->π:Landroid/widget/TextView;

    .line 28
    .line 29
    iput-object p13, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ρ:Landroid/widget/TextView;

    .line 30
    .line 31
    iput-object p14, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->σ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;

    .line 32
    .line 33
    move-object/from16 p1, p15

    .line 34
    .line 35
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->τ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;

    .line 36
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ε:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->υ:Ljava/io/Serializable;

    .line 9
    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    .line 12
    .line 13
    iget-object v15, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->σ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;

    .line 14
    .line 15
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->τ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;

    .line 16
    .line 17
    iget-object v3, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ζ:Landroid/app/Activity;

    .line 18
    .line 19
    iget-object v4, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->η:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 20
    .line 21
    iget-object v5, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->θ:Landroid/widget/TextView;

    .line 22
    .line 23
    iget-object v6, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ι:Landroid/widget/TextView;

    .line 24
    .line 25
    iget-object v7, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->κ:Landroid/widget/TextView;

    .line 26
    .line 27
    iget-object v8, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->λ:Landroid/widget/ListView;

    .line 28
    .line 29
    iget-object v9, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->μ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;

    .line 30
    .line 31
    iget-object v10, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ν:Landroid/widget/TextView;

    .line 32
    .line 33
    iget-object v11, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ξ:Landroid/widget/TextView;

    .line 34
    .line 35
    iget-object v12, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ο:Landroid/widget/TextView;

    .line 36
    .line 37
    iget-object v13, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->π:Landroid/widget/TextView;

    .line 38
    .line 39
    iget-object v14, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ρ:Landroid/widget/TextView;

    .line 40
    .line 41
    move-object/from16 v17, p1

    .line 42
    .line 43
    move/from16 v18, p2

    .line 44
    .line 45
    move-object/from16 v16, v1

    .line 46
    .line 47
    invoke-static/range {v2 .. v18}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->λ(Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/content/DialogInterface;I)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_0
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->υ:Ljava/io/Serializable;

    .line 52
    .line 53
    move-object/from16 v16, v1

    .line 54
    .line 55
    check-cast v16, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 56
    .line 57
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->σ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;

    .line 58
    .line 59
    iget-object v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->τ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;

    .line 60
    .line 61
    iget-object v3, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ζ:Landroid/app/Activity;

    .line 62
    .line 63
    iget-object v4, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->η:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 64
    .line 65
    iget-object v5, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->θ:Landroid/widget/TextView;

    .line 66
    .line 67
    iget-object v6, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ι:Landroid/widget/TextView;

    .line 68
    .line 69
    iget-object v7, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->κ:Landroid/widget/TextView;

    .line 70
    .line 71
    iget-object v8, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->λ:Landroid/widget/ListView;

    .line 72
    .line 73
    iget-object v9, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->μ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;

    .line 74
    .line 75
    iget-object v10, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ν:Landroid/widget/TextView;

    .line 76
    .line 77
    iget-object v11, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ξ:Landroid/widget/TextView;

    .line 78
    .line 79
    iget-object v12, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ο:Landroid/widget/TextView;

    .line 80
    .line 81
    iget-object v13, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->π:Landroid/widget/TextView;

    .line 82
    .line 83
    iget-object v0, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ρ:Landroid/widget/TextView;

    .line 84
    .line 85
    move-object/from16 v31, p1

    .line 86
    .line 87
    move/from16 v32, p2

    .line 88
    .line 89
    move-object/from16 v28, v0

    .line 90
    .line 91
    move-object/from16 v29, v1

    .line 92
    .line 93
    move-object/from16 v30, v2

    .line 94
    .line 95
    move-object/from16 v17, v3

    .line 96
    .line 97
    move-object/from16 v18, v4

    .line 98
    .line 99
    move-object/from16 v19, v5

    .line 100
    .line 101
    move-object/from16 v20, v6

    .line 102
    .line 103
    move-object/from16 v21, v7

    .line 104
    .line 105
    move-object/from16 v22, v8

    .line 106
    .line 107
    move-object/from16 v23, v9

    .line 108
    .line 109
    move-object/from16 v24, v10

    .line 110
    .line 111
    move-object/from16 v25, v11

    .line 112
    .line 113
    move-object/from16 v26, v12

    .line 114
    .line 115
    move-object/from16 v27, v13

    .line 116
    .line 117
    invoke-static/range {v16 .. v32}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->π(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/content/DialogInterface;I)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_1
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->υ:Ljava/io/Serializable;

    .line 122
    .line 123
    move-object/from16 v16, v1

    .line 124
    .line 125
    check-cast v16, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 126
    .line 127
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->σ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;

    .line 128
    .line 129
    iget-object v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->τ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;

    .line 130
    .line 131
    iget-object v3, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ζ:Landroid/app/Activity;

    .line 132
    .line 133
    iget-object v4, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->η:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;

    .line 134
    .line 135
    iget-object v5, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->θ:Landroid/widget/TextView;

    .line 136
    .line 137
    iget-object v6, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ι:Landroid/widget/TextView;

    .line 138
    .line 139
    iget-object v7, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->κ:Landroid/widget/TextView;

    .line 140
    .line 141
    iget-object v8, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->λ:Landroid/widget/ListView;

    .line 142
    .line 143
    iget-object v9, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->μ:Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;

    .line 144
    .line 145
    iget-object v10, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ν:Landroid/widget/TextView;

    .line 146
    .line 147
    iget-object v11, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ξ:Landroid/widget/TextView;

    .line 148
    .line 149
    iget-object v12, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ο:Landroid/widget/TextView;

    .line 150
    .line 151
    iget-object v13, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->π:Landroid/widget/TextView;

    .line 152
    .line 153
    iget-object v0, v0, Lcom/example/dyhelper/hook/comment/bookmark/δ;->ρ:Landroid/widget/TextView;

    .line 154
    .line 155
    move-object/from16 v31, p1

    .line 156
    .line 157
    move/from16 v32, p2

    .line 158
    .line 159
    move-object/from16 v28, v0

    .line 160
    .line 161
    move-object/from16 v29, v1

    .line 162
    .line 163
    move-object/from16 v30, v2

    .line 164
    .line 165
    move-object/from16 v17, v3

    .line 166
    .line 167
    move-object/from16 v18, v4

    .line 168
    .line 169
    move-object/from16 v19, v5

    .line 170
    .line 171
    move-object/from16 v20, v6

    .line 172
    .line 173
    move-object/from16 v21, v7

    .line 174
    .line 175
    move-object/from16 v22, v8

    .line 176
    .line 177
    move-object/from16 v23, v9

    .line 178
    .line 179
    move-object/from16 v24, v10

    .line 180
    .line 181
    move-object/from16 v25, v11

    .line 182
    .line 183
    move-object/from16 v26, v12

    .line 184
    .line 185
    move-object/from16 v27, v13

    .line 186
    .line 187
    invoke-static/range {v16 .. v32}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->γ(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ListView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$CommentBookmarkAdapter;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$ProfileBookmarkAdapter;Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog$VideoBookmarkAdapter;Landroid/content/DialogInterface;I)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
